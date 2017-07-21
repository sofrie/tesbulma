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
        

}
