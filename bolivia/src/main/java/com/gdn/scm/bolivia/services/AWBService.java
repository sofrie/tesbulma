/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.request.AWBRequest;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
    
    Page<AWB> getByMerchantCode(String merchantCode,Pageable pageable);
    
    Page<AWB> getByGdnRef(String gdnRef,Pageable pageable);
    
    Page<AWB> filterAll(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    Page<AWB> filterByInvoice(String month, String year, String logisticName,Pageable pageable);

    void updateAWB(AWB a);

    void deleteAWB(Integer id);
    
    Page<AWB> findAll(Pageable pageable);
    
    Page<AWB> findByStatus(String status,Pageable pageable);
    
    Page<AWB> findByMonth(String month,Pageable pageable);
    
    Page<AWB> findByYear(String year,Pageable pageable);
    
    Page<AWB> findByLogisticName(String logisticName, Pageable pageable);
    
    BigDecimal countTotalTagihan();
    
    //Sort by AWBNumber
    
    Page<AWB> findAllSortByAwbNumberASC(Pageable pageable);
    Page<AWB> findAllSortByAwbNumberDESC(Pageable pageable);
    
    Page<AWB> findMonthSortByAwbNumberASC(String month,Pageable pageable);
    Page<AWB> findMonthSortByAwbNumberDESC(String month,Pageable pageable);
    
    Page<AWB> findYearSortByAwbNumberASC(String year,Pageable pageable);
    Page<AWB> findYearSortByAwbNumberDESC(String year,Pageable pageable);
    
    Page<AWB> findStatusSortByAwbNumberASC(String status,Pageable pageable);
    Page<AWB> findStatusSortByAwbNumberDESC(String status,Pageable pageable);
    
    Page<AWB> findLogisticSortByAwbNumberASC(String logistic,Pageable pageable);
    Page<AWB> findLogisticSortByAwbNumberDESC(String logistic,Pageable pageable);
    
    Page<AWB> findMerchantCodeSortByAwbNumberASC(String merchantCode,Pageable pageable);
    Page<AWB> findMerchantCodeSortByAwbNumberDESC(String merchantCode,Pageable pageable);
    
    List<AWB> findAwbNumberSortByAwbNumberASC(String awbNumber);
    List<AWB> findAwbNumberSortByAwbNumberDESC(String awbNumber);
    
    Page<AWB> findGdnRefSortByAwbNumberASC(String gdnRef,Pageable pageable);
    Page<AWB> findGdnRefSortByAwbNumberDESC(String gdnRef,Pageable pageable);
    
    Page<AWB> filterAllSortByAwbNumberASC(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    Page<AWB> filterAllSortByAwbNumberDESC(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    
    Page<AWB> filterByInvoiceSortByAwbNumberASC(String month, String year, String logisticName,Pageable pageable);
    Page<AWB> filterByInvoiceSortByAwbNumberDESC(String month, String year, String logisticName,Pageable pageable);
    
    //Sort by ReconStatus
    
    Page<AWB> findAllSortByStatusASC(Pageable pageable);
    Page<AWB> findAllSortByStatusDESC(Pageable pageable);
    
    Page<AWB> findMonthSortByStatusASC(String month,Pageable pageable);
    Page<AWB> findMonthSortByStatusDESC(String month,Pageable pageable);
    
    Page<AWB> findYearSortByStatusASC(String year,Pageable pageable);
    Page<AWB> findYearSortByStatusDESC(String year,Pageable pageable);
    
    Page<AWB> findStatusSortByStatusASC(String status,Pageable pageable);
    Page<AWB> findStatusSortByStatusDESC(String status,Pageable pageable);
    
    Page<AWB> findLogisticSortByStatusASC(String logistic,Pageable pageable);
    Page<AWB> findLogisticSortByStatusDESC(String logistic,Pageable pageable);
    
    Page<AWB> findMerchantCodeSortByStatusASC(String merchantCode,Pageable pageable);
    Page<AWB> findMerchantCodeSortByStatusDESC(String merchantCode,Pageable pageable);
    
    List<AWB> findAwbNumberSortByStatusASC(String awbNumber);
    List<AWB> findAwbNumberSortByStatusDESC(String awbNumber);
    
    Page<AWB> findGdnRefSortByStatusASC(String gdnRef,Pageable pageable);
    Page<AWB> findGdnRefSortByStatusDESC(String gdnRef,Pageable pageable);
    
    Page<AWB> filterAllSortByStatusASC(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    Page<AWB> filterAllSortByStatusDESC(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    
    Page<AWB> filterByInvoiceSortByStatusASC(String month, String year, String logisticName,Pageable pageable);
    Page<AWB> filterByInvoiceSortByStatusDESC(String month, String year, String logisticName,Pageable pageable);
}
