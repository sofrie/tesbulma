/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.request.UploadHistoryRequest;
import java.util.List;

/**
 *
 * @author sofrie.zumaytis
 */
public interface UploadHistoryService {
    void addUploadHistory(UploadHistoryRequest a);

    List<UploadHistory> GetAll();

    List<UploadHistory> GetbyStatus(String status);
    
    List<UploadHistory> GetbyYear(String year);
    
    List<UploadHistory> GetbyLogisticName (String logisticName);
    
    List<UploadHistory> GetbyMonth(String month);    
   
    List<UploadHistory> filterAll(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef);

    void updateUploadHistory(UploadHistory a);

    void DeleteUploadHistory(Integer id);
}
