/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.entity.UploadHistory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sofrie.zumaytis
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, String> {

    public Invoice findByMonthAndYearAndLogisticName(Integer month, Integer year, String logisticName);

    public List<Invoice> findByMonth(Integer month);
    
    public List<Invoice> findByYear(Integer year);
    
    public Invoice findTop1ByOrderByLastModifiedDesc();

   
}
