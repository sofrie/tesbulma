/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.repository.AWBRepository;
import com.gdn.scm.bolivia.request.AWBRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AWB> GetAll() {
        return aWBRepository.findAll();
    }

    @Override
    public List<AWB> GetbyStatus(String status) {
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
    public void DeleteAWB(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AWB> GetbyMonth(String month) {
        return aWBRepository.findByMonth(month);
    }

    @Override
    public List<AWB> GetbyYear(String year) {
        return aWBRepository.findByYear(year);
    }

    @Override
    public List<AWB> GetbyLogisticName(String logisticName) {
        return aWBRepository.findByLogisticName(logisticName);
    }

    @Override
    public List<String> selectAllYear() {
        return aWBRepository.selectAllYear();
    }

    @Override
    public List<AWB> GetByAwbNumber(String awbNumber) {
        return aWBRepository.findByAwbNumber(awbNumber);
    }

    @Override
    public List<AWB> GetByMerchantCode(String merchantCode) {
        return aWBRepository.findByMerchantCode(merchantCode);
    }

    @Override
    public List<AWB> GetByGdnRef(String gdnRef) {
        return aWBRepository.findByGdnRef(gdnRef);
    }

    @Override
    public List<AWB> filterAll(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef) {
        if (reconStatus.equals("All")) {
            return aWBRepository.filterAllExceptStatus(month, year, logisticName, AwbNumber, merchantCode, gdnRef);
        } else {
            return aWBRepository.filterAll(month, year, logisticName, AwbNumber, reconStatus, merchantCode, gdnRef);
        }
    }

}
