/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.receiver;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Compare;
import com.gdn.scm.bolivia.services.CacheService;
import com.gdn.scm.bolivia.entity.Process;
import com.gdn.scm.bolivia.entity.Tolerance;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.repository.AWBRepository;
import com.gdn.scm.bolivia.services.AWBClientServiceImplFeign;
import com.gdn.scm.bolivia.services.AWBService;
import com.gdn.scm.bolivia.services.ToleranceService;
import com.gdn.scm.bolivia.services.UploadHistoryService;
import com.jayway.jsonpath.internal.function.numeric.Max;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author sofrie.zumaytis
 */
@Component
public class Receiver {

    @Autowired
    CacheService cacheSrvice;

    @Autowired
    UploadHistoryService uploadHistoryService;

    @Autowired
    Compare compare;

    @Autowired
    AmqpAdmin admin;

    @Autowired
    AWBService awb;

    @Autowired
    AWBRepository awbRepository;

    @Autowired
    ToleranceService toleranceService;

    AWBClientServiceImplFeign awbFeign = new AWBClientServiceImplFeign();

    Integer counter = 0;

    public void receiveMessage(Process message) throws InterruptedException {

        System.out.println("Received <" + message + ">");
        if (cacheSrvice.setIfAbsent(message.getProccessId(), message.getRequestId())) {
            //berarti belum pernah ada yg nge set
            System.out.println("Processing... " + message);

            Thread.sleep(5000);

            cacheSrvice.delete(message.getProccessId());

            if (message.getCounter() == compare.counter) {
                UploadHistory upload = uploadHistoryService.getById(message.getRequestId());
                upload.setStatus("Done Uploaded");
                uploadHistoryService.addUploadHistory(upload);
            }
        } else {
            //lagi ada yg di proses
            System.out.println("Error..." + message + " is still on process");
        }
    }

//    Integer c = 0;
    public void receiveMessage(AWB message) throws InterruptedException, Exception {
        try {
            System.out.println("Received <" + message + ">");
            //awb.addAWB(message);
            counter++;
            Boolean ada = false;
            Integer c = 0;
            cacheSrvice.delete(message.getAwbNumber());
            compare.map.remove(message.getAwbNumber(), message.getUploadHistoryNumber());

            Tolerance tolerance = toleranceService.getTolerance();
            //get awb from logistic
            AWB fromLogistic = awbFeign.getAWBLogistic(message.getAwbNumber());
            if (fromLogistic != null) {
                System.out.println("AWB------------------" + message.getAwbNumber());
                message.setPriceLogistic(fromLogistic.getPriceLogistic());
                message.setWeightLogistic(fromLogistic.getWeightLogistic());
                message.setInsuranceChargeLogistic(fromLogistic.getInsuranceChargeLogistic());
                message.setOtherChargeLogistic(fromLogistic.getOtherChargeLogistic());
                message.setTotalChargeLogistic(fromLogistic.getTotalChargeLogistic());
                Integer counterBeda = 0;

                //untuk perhitungan toleransi
                BigDecimal tolerancePercent = message.getPriceSystem().add(tolerance.getPricePercentage().multiply(message.getPriceSystem()));
                BigDecimal toleranceAmount = message.getPriceSystem().add(tolerance.getPriceAmount());
                BigDecimal max = tolerancePercent.max(toleranceAmount);
                if (message.getPriceLogistic() != null && message.getPriceLogistic().compareTo(max) > 0) {
                    message.setPriceComment("Beda");
                    counterBeda++;
                } else {
                    message.setPriceComment("-");
                }

                tolerancePercent = message.getWeightSystem().add(tolerance.getWeightPercentage().multiply(message.getWeightSystem()));
                toleranceAmount = message.getWeightSystem().add(tolerance.getWeightAmount());
                max = tolerancePercent.max(toleranceAmount);
                if (message.getWeightLogistic() != null && message.getWeightLogistic().compareTo(max) > 0) {
                    message.setWeightComment("Beda");
                    counterBeda++;
                } else {
                    message.setWeightComment("-");
                }

                tolerancePercent = message.getInsuranceChargeSystem().add(tolerance.getInsuranceChargePercentage().multiply(message.getInsuranceChargeSystem()));
                toleranceAmount = message.getInsuranceChargeSystem().add(tolerance.getInsuranceChargeAmount());
                max = tolerancePercent.max(toleranceAmount);
                if (message.getInsuranceChargeLogistic() != null && message.getInsuranceChargeLogistic().compareTo(max) > 0) {
                    message.setInsuranceChargeComment("Beda");
                    counterBeda++;
                } else {
                    message.setInsuranceChargeComment("-");
                }

                tolerancePercent = message.getOtherChargeSystem().add(tolerance.getOtherChargePercentage().multiply(message.getOtherChargeSystem()));
                toleranceAmount = message.getOtherChargeSystem().add(tolerance.getOtherChargeAmount());
                max = tolerancePercent.max(toleranceAmount);
                if (message.getOtherChargeLogistic() != null && message.getOtherChargeLogistic().compareTo(max) > 0) {
                    message.setOtherChargeComment("Beda");
                    counterBeda++;
                } else {
                    message.setOtherChargeComment("-");
                }

                tolerancePercent = message.getTotalChargeSystem().add(tolerance.getTotalShippingPercentage().multiply(message.getTotalChargeSystem()));
                toleranceAmount = message.getTotalChargeSystem().add(tolerance.getTotalShippingAmount());
                max = tolerancePercent.max(toleranceAmount);
                if (message.getTotalChargeLogistic() != null && message.getTotalChargeLogistic().compareTo(max) > 0) {
                    message.setTotalChargeComment("Beda");
                    counterBeda++;
                } else {
                    message.setTotalChargeComment("-");
                }

                //klo ada data yg beda status si awb nya jadi problem exist, klo ngga berarti OK
                if (counterBeda != 0) {
                    message.setReconStatus("Problem Exist");
                } else {
                    message.setReconStatus("OK");
                }
            }
            //klo uda dibandingin di save
            awbRepository.save(message);
//            for (Map.Entry<String, String> entry : compare.map.entrySet()) {
//                String key = entry.getKey();
//                if (key.equals(message.getUploadHistoryNumber())) {
//                    c++;
//                }
//                if (c > 2) {
//                    break;
//                }
//            }
//            if (c <= 1) {
//                UploadHistory upload = uploadHistoryService.getById(message.getUploadHistoryNumber());
//                if (upload != null) {
//                    upload.setStatus("Done Uploaded");
//                    System.out.println("=======aaaaaaaaaaaaaaaaaaaaaaaa");
//                    uploadHistoryService.addUploadHistory(upload);
//                    //    admin.deleteQueue(BoliviaApplication.queueName);
//                }
//                //counter = 0;
//            }
            //}
            if (counter >= compare.counter) {
                UploadHistory upload = uploadHistoryService.getById(message.getUploadHistoryNumber());
                if (upload != null) {
                    upload.setStatus("Done Uploaded");
                    System.out.println("=======aaaaaaaaaaaaaaaaaaaaaaaa");
                    System.out.println("iiiiddddd" + upload.getId().toString());
                    uploadHistoryService.addUploadHistory(upload);
                    //    admin.deleteQueue(BoliviaApplication.queueName);
                    counter = 0;
                    compare.counter = 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
