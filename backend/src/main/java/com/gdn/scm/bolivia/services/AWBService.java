/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.request.AWBRequest;
import java.util.List;

/**
 *
 * @author sofrie.zumaytis
 */
public interface AWBService {

    void addAWB(AWBRequest a);
    void addAWB(AWB a);

    List<AWB> getAll();

    List<AWB> getByStatus(String status);
    
    List<AWB> getByYear(String year);
    
    List<AWB> getByLogisticName (String logisticName);
    
    List<AWB> getByMonth(String month);
    
    List<String> selectAllYear();
    
    List<AWB> getByAwbNumber(String awbNumber);
    
    List<AWB> getByMerchantCode(String merchantCode);
    
    List<AWB> getByGdnRef(String gdnRef);
    
    List<AWB> filterAll(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef);

    void updateAWB(AWB a);

    void deleteAWB(Integer id);
}
