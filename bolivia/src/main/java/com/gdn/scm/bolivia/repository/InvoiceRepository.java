/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Invoice;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sofrie.zumaytis
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

    public List<Invoice> findByMonth(String month);

    public List<Invoice> findByYear(String year);

//    @Query("SELECT l.logisticName" +
//"  FROM Invoice i" +
//"  JOIN LogisticProvider l" +
//"  ON l.id=i.blv_logistic_provider_id" +
//"  WHERE i.id=?")
//    public List<String> getLogisticName(Integer id);
   
}
