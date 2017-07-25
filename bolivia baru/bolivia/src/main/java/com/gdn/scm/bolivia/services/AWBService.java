/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Invoice;
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

    void addAWB(AWB a, Boolean isUpdate);

    List<AWB> getAll();

    List<AWB> getByStatus(String status);

    List<AWB> getByYear(Integer year);

    List<AWB> getByLogisticName(String logisticName);

    List<AWB> getByMonth(Integer month);

    List<String> selectAllYear();

    List<AWB> getByAwbNumber(String awbNumber);


    void updateAWB(AWB a);

    void deleteAWB(Integer id);

    Page<AWB> findAll(Pageable pageable);

    Page<AWB> findByStatus(String status, Pageable pageable);

    Page<AWB> findByMonth(Integer month, Pageable pageable);

    Page<AWB> findByYear(Integer year, Pageable pageable);

    Page<AWB> findByLogisticName(String logisticName, Pageable pageable);

    BigDecimal countTotalTagihan();

    Page<AWB> sortByAWBNumberAsc(Pageable pageable);

    AWB findByAwbNumberAndInvoice(String awbNumber, Invoice invoice);

    BigDecimal countTagihan(Invoice invoice);
    
    
    
    Page<AWB> getByMerchantCode(String merchantCode,Pageable pageable);
    
    Page<AWB> getByGdnRef(String gdnRef,Pageable pageable);
    
    Page<AWB> filterAll(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    Page<AWB> filterByInvoice(Integer month, Integer year, String logisticName,Pageable pageable);
    
    
    //pageable sorting awb
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
        

    
    //pageable sorting by GdnRef
    Page<AWB> findAllSortByGdnRefASC(Pageable pageable);
    Page<AWB> findAllSortByGdnRefDESC(Pageable pageable);
    
    Page<AWB> findMonthSortByGdnRefASC(String month,Pageable pageable);
    Page<AWB> findMonthSortByGdnRefDESC(String month,Pageable pageable);
    
    Page<AWB> findYearSortByGdnRefASC(String year,Pageable pageable);
    Page<AWB> findYearSortByGdnRefDESC(String year,Pageable pageable);
    
    Page<AWB> findStatusSortByGdnRefASC(String status,Pageable pageable);
    Page<AWB> findStatusSortByGdnRefDESC(String status,Pageable pageable);
    
    Page<AWB> findLogisticSortByGdnRefASC(String logistic,Pageable pageable);
    Page<AWB> findLogisticSortByGdnRefDESC(String logistic,Pageable pageable);
    
    Page<AWB> findMerchantCodeSortByGdnRefASC(String merchantCode,Pageable pageable);
    Page<AWB> findMerchantCodeSortByGdnRefDESC(String merchantCode,Pageable pageable);
    
    List<AWB> findGdnRefSortByGdnRefASC(String awbNumber);
    List<AWB> findGdnRefSortByGdnRefDESC(String awbNumber);
    
    Page<AWB> findGdnRefSortByGdnRefASC(String gdnRef,Pageable pageable);
    Page<AWB> findGdnRefSortByGdnRefDESC(String gdnRef,Pageable pageable);
    
    Page<AWB> filterAllSortByGdnRefASC(String month, String year, String logisticName, String GdnRef, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    Page<AWB> filterAllSortByGdnRefDESC(String month, String year, String logisticName, String GdnRef, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    
    Page<AWB> filterByInvoiceSortByGdnRefASC(String month, String year, String logisticName,Pageable pageable);
    Page<AWB> filterByInvoiceSortByGdnRefDESC(String month, String year, String logisticName,Pageable pageable);
    
    
}
