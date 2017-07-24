/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.UploadHistory;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author sofrie.zumaytis
 */
public interface AWBRepository extends JpaRepository<AWB, Integer> {

    public Page<AWB> findByReconStatus(String status, Pageable pageable);

    public List<AWB> findByReconStatus(String status);
    

    public Page<AWB> findByMonth(String month, Pageable pageable);

    public List<AWB> findByMonth(String month);
    

    public Page<AWB> findByYear(String year, Pageable pageable);

    public List<AWB> findByYear(String year);
    

    public Page<AWB> findByLogisticName(String logisticName, Pageable pageable);

    public List<AWB> findByLogisticName(String logisticName);
    

    public List<AWB> findByAwbNumber(String awbNumber);

    @Query("SELECT distinct a from AWB a where a.merchantCode like ?")
    public Page<AWB> findByMerchantCode(String merchantCode, Pageable pageable);

     @Query("SELECT distinct a from AWB a where a.gdnRef like ?")
    public Page<AWB> findByGdnRef(String gdnRef,Pageable pageable);

    @Query("SELECT distinct reconStatus from AWB")
    public List<String> selectAllYear();

    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? AND a.awbNumber like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ?")
    public Page<AWB> filterAll(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);

    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? AND a.awbNumber like ? AND a.merchantCode like ? AND a.gdnRef like ?")
    public Page<AWB> filterAllExceptStatus(String month, String year, String logisticName, String AwbNumber, String merchantCode, String gdnRef,Pageable pageable);
    
    @Query("select a from AWB a order by a.awbNumber")
    public List<AWB> findAllOrderByawbNumber();
    
    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ?")
    public Page<AWB> filterByInvoice(String month, String year, String logisticName,Pageable pageable);
    
    @Query("select sum (a.totalChargeLogistic) from AWB a")
    public BigDecimal countTotalTagihan();
    
    //sorting by awb
    @Query("select a from AWB a order by a.awbNumber ASC")
    public Page<AWB> findAllSortByAwbNumberASC(Pageable pageable);
    
    @Query("select a from AWB a order by a.awbNumber DESC")
    public Page<AWB> findAllSortByAwbNumberDESC(Pageable pageable);
    
    
    @Query("select a from AWB a where a.month like ? order by a.awbNumber ASC")
    public Page<AWB> findMonthSortByAwbNumberASC(String month, Pageable pageable);
    
    @Query("select a from AWB a where a.month like ? order by a.awbNumber DESC")
    public Page<AWB> findMonthSortByAwbNumberDESC(String month, Pageable pageable);
    
    
    @Query("select a from AWB a where a.reconStatus like ? order by a.awbNumber ASC")
    public Page<AWB> findReconStatusSortByAwbNumberASC(String status, Pageable pageable);
    
    @Query("select a from AWB a where a.reconStatus like ? order by a.awbNumber DESC")
    public Page<AWB> findReconStatusSortByAwbNumberDESC(String status, Pageable pageable);
    
    @Query("select a from AWB a where a.year like ? order by a.awbNumber ASC")
    public Page<AWB> findYearSortByAwbNumberASC(String year, Pageable pageable);
    
    @Query("select a from AWB a where a.year like ? order by a.awbNumber DESC")
    public Page<AWB> findYearSortByAwbNumberDESC(String year, Pageable pageable);
    
    @Query("select a from AWB a where a.logisticName like ? order by a.awbNumber ASC")
    public Page<AWB> findLogisticSortByAwbNumberASC(String logistic, Pageable pageable);
    
    @Query("select a from AWB a where a.logisticName like ? order by a.awbNumber DESC")
    public Page<AWB> findLogisticSortByAwbNumberDESC(String logistic, Pageable pageable);
    
    @Query("select a from AWB a where a.merchantCode like ? order by a.awbNumber ASC")
    public Page<AWB> findMerchantCodeSortByAwbNumberASC(String merchantCode, Pageable pageable);
    
    @Query("select a from AWB a where a.merchantCode like ? order by a.awbNumber DESC")
    public Page<AWB> findMerchantCodeSortByAwbNumberDESC(String merchantCode, Pageable pageable);
    
    @Query("select a from AWB a where a.awbNumber like ? order by a.awbNumber ASC")
    public List<AWB> findAwbNumberSortByAwbNumberASC(String awbNumber);
    
    @Query("select a from AWB a where a.awbNumber like ? order by a.awbNumber DESC")
    public List<AWB> findAwbNumberSortByAwbNumberDESC(String awbNumber);
    
    @Query("select a from AWB a where a.gdnRef like ? order by a.awbNumber ASC")
    public Page<AWB> findGdnRefSortByAwbNumberASC(String gdnRef, Pageable pageable);
    
    @Query("select a from AWB a where a.gdnRef like ? order by a.awbNumber DESC")
    public Page<AWB> findGdnRefSortByAwbNumberDESC(String gdnRef, Pageable pageable);
    
    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? AND a.awbNumber like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.awbNumber ASC")
    public Page<AWB> filterAllSortByAwbNumberASC(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);

    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? AND a.awbNumber like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.awbNumber DESC")
    public Page<AWB> filterAllSortByAwbNumberDESC(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    
    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? AND a.awbNumber like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.awbNumber ASC")
    public Page<AWB> filterAllExceptStatusSortByAwbNumberASC(String month, String year, String logisticName, String AwbNumber, String merchantCode, String gdnRef,Pageable pageable);
    
    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? AND a.awbNumber like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.awbNumber DESC")
    public Page<AWB> filterAllExceptStatusSortByAwbNumberDESC(String month, String year, String logisticName, String AwbNumber, String merchantCode, String gdnRef,Pageable pageable);
    
    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? order by a.awbNumber ASC")
    public Page<AWB> filterByInvoiceSortByAwbNumberASC(String month, String year, String logisticName,Pageable pageable);
    
    @Query("select a from AWB a where a.month like ? AND a.year like ? AND a.logisticName like ? order by a.awbNumber DESC")
    public Page<AWB> filterByInvoiceSortByAwbNumberDESC(String month, String year, String logisticName,Pageable pageable);
}
