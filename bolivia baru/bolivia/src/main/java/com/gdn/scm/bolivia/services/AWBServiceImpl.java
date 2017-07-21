/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.repository.AWBRepository;
import com.gdn.scm.bolivia.request.AWBRequest;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class AWBServiceImpl implements AWBService {

    @Autowired
    AWBRepository aWBRepository;

    @Override
    public void addAWB(AWBRequest a) {
        AWB awb = new AWB();
        BeanUtils.copyProperties(a, awb);
        awb.setId(UUID.randomUUID().toString());
        try {
            aWBRepository.save(awb);
        } catch (Exception e) {
            System.out.println("gagal awb---------");
            e.printStackTrace();
        }
    }

    @Override
    public List<AWB> getAll() {
        return aWBRepository.findAll();
    }

    @Override
    public List<AWB> getByStatus(String status) {
        if (status.equals("All")) {
            return aWBRepository.findAll();
        } else {
            return aWBRepository.findByReconStatus(status);
        }
    }

    @Override
    public void updateAWB(AWB a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAWB(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AWB> getByMonth(Integer month) {
        return aWBRepository.findByMonth(month);
    }

    @Override
    public List<AWB> getByYear(Integer year) {
        return aWBRepository.findByYear(year);
    }

    @Override
    public List<AWB> getByLogisticName(String logisticName) {
        return aWBRepository.findByLogisticName(logisticName);
    }

    @Override
    public List<String> selectAllYear() {
        return aWBRepository.selectAllYear();
    }

    @Override
    public List<AWB> getByAwbNumber(String awbNumber) {
        return aWBRepository.findByAwbNumber(awbNumber);
    }

//    @Override
//    public List<AWB> getByMerchantCode(String merchantCode) {
//        return aWBRepository.findByMerchantCode(merchantCode);
//    }
//
//    @Override
//    public List<AWB> getByGdnRef(String gdnRef) {
//        return aWBRepository.findByGdnRef(gdnRef);
//    }
//
//    @Override
//    public List<AWB> filterAll(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef) {
//        if (reconStatus.equals("All")) {
//            return aWBRepository.filterAllExceptStatus(month, year, logisticName, AwbNumber, merchantCode, gdnRef);
//        } else {
//            return aWBRepository.filterAll(month, year, logisticName, AwbNumber, reconStatus, merchantCode, gdnRef);
//        }
//    }

    @Override
    public void addAWB(AWB a, Boolean isUpdate) {
        AWB awb = new AWB();
        BeanUtils.copyProperties(a, awb);

        try {
            aWBRepository.save(awb);
        } catch (Exception e) {
            System.out.println("gagal awb---------");
            e.printStackTrace();
        }
    }

    @Override
    public Page<AWB> findAll(Pageable pageable) {
        return aWBRepository.findAll(pageable);
    }

    @Override
    public Page<AWB> findByStatus(String status, Pageable pageable) {
        if (status.equals("All")) {
            return aWBRepository.findAll(pageable);
        } else {
            return aWBRepository.findByReconStatus(status, pageable);
        }
    }

    @Override
    public Page<AWB> findByMonth(Integer month, Pageable pageable) {
        return aWBRepository.findByMonth(month, pageable);
    }

    @Override
    public Page<AWB> findByYear(Integer year, Pageable pageable) {
        return aWBRepository.findByYear(year, pageable);
    }

    @Override
    public Page<AWB> findByLogisticName(String logisticName, Pageable pageable) {
        return aWBRepository.findByLogisticName(logisticName, pageable);
    }

    @Override
    public BigDecimal countTotalTagihan() {
        return aWBRepository.countTotalTagihan();
    }

    @Override
    public Page<AWB> sortByAWBNumberAsc(Pageable pageable) {
        return aWBRepository.sortByAWBNumberAsc(pageable);
    }

    @Override
    public AWB findByAwbNumberAndInvoice(String awbNumber, Invoice invoice) {
        return aWBRepository.findByAwbNumberAndInvoice(awbNumber, invoice);
    }

    @Override
    public BigDecimal countTagihan(Invoice invoice) {
        return aWBRepository.countTagihan(invoice);
    }

    @Override
    public Page<AWB> getByMerchantCode(String merchantCode, Pageable pageable) {
        return aWBRepository.findByMerchantCode(merchantCode, pageable);
    }

    @Override
    public Page<AWB> getByGdnRef(String gdnRef, Pageable pageable) {
        return aWBRepository.findByGdnRef(gdnRef,pageable);
    }

    @Override
    public Page<AWB> filterAll(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef, Pageable pageable) {
        if (reconStatus.equals("All")) {
            return aWBRepository.filterAllExceptStatus(month, year, logisticName, AwbNumber, merchantCode, gdnRef, pageable);
        } else {
            return aWBRepository.filterAll(month, year, logisticName, AwbNumber, reconStatus, merchantCode, gdnRef, pageable);
        }
    }

    @Override
    public Page<AWB> filterByInvoice(Integer month, Integer year, String logisticName, Pageable pageable) {
        return aWBRepository.filterByInvoice(month,year,logisticName,pageable);
    }

}
