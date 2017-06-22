/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.receiver;

import com.gdn.scm.bolivia.BoliviaApplication;
import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Compare;
import com.gdn.scm.bolivia.services.CacheService;
import com.gdn.scm.bolivia.entity.Process;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.services.AWBService;
import com.gdn.scm.bolivia.services.UploadHistoryService;
import java.util.Iterator;
import java.util.Map;
import org.redisson.api.RMap;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
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
    public void receiveMessage(AWB message) throws InterruptedException {
        System.out.println(compare.counter.toString());
        System.out.println("Received <" + message + ">");
        //awb.addAWB(message);
        counter++;
        Boolean ada = false;
        Integer c = 0;
//        System.out.println("=======" + counter.toString());
//         System.out.println("============"+"++++++++++++++++"+compare.map.size());
//        if (cacheSrvice.setIfAbsent(message.getAwbNumber(), message.getGdnRef())) {
//            System.out.println("Processing... " + message.getAwbNumber());
//            Thread.sleep(5000);
////            c++;
////            System.out.println("=======" + c.toString());
//            cacheSrvice.delete(message.getAwbNumber());
//        } else {
//            //lagi ada yg di proses
//            System.out.println("Error..." + message + " is still on process");
//        }
        cacheSrvice.delete(message.getAwbNumber());
        compare.map.remove(message.getAwbNumber(), message.getUploadHistoryNumber());
        if (compare.map.containsValue(message.getUploadHistoryNumber())) {
            
            for (Map.Entry<String, String> entry : compare.map.entrySet()) {
                String key = entry.getKey();
                if(key.equals(message.getUploadHistoryNumber()))
                {
                    c++;
                }
                if(c>2)
                {
                    break;
                }
            }
            if (c <= 1) {
                UploadHistory upload = uploadHistoryService.getById(message.getUploadHistoryNumber());
                if (upload != null) {
                    upload.setStatus("Done Uploaded");
                    uploadHistoryService.addUploadHistory(upload);
                    //System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                    //    admin.deleteQueue(BoliviaApplication.queueName);
                }
                //counter = 0;
            }
        }
        if (counter >= compare.counter) {

        }
    }
}
