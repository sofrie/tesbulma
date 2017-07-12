/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.UploadHistory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author sofrie.zumaytis
 */
public interface AWBRepository extends JpaRepository<AWB, String> {

    public List<AWB> findByReconStatus(String status);

    public List<AWB> findByMonth(String month);

    public List<AWB> findByYear(String year);

    public List<AWB> findByLogisticName(String logisticName);
    
    public List<AWB> findByAwbNumber(String awbNumber);
    
    public List<AWB> findByMerchantCode(String merchantCode);
    
    public List<AWB> findByGdnRef(String gdnRef);

    @Query("SELECT distinct reconStatus from AWB")
    public List<String> selectAllYear();
    
    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? AND a.awbNumber like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ?")
    public List<AWB> filterAll(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef);
    
    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? AND a.awbNumber like ? AND a.merchantCode like ? AND a.gdnRef like ?")
    public List<AWB> filterAllExceptStatus(String month, String year, String logisticName, String AwbNumber, String merchantCode, String gdnRef);
    
    @Query("select a from AWB a order by a.awbNumber")
    public List<AWB> findAllOrderByawbNumber();
}
