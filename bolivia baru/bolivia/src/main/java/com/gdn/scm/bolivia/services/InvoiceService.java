/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.request.InvoiceRequest;
import java.util.List;

/**
 *
 * @author sofrie.zumaytis
 */
public interface InvoiceService {
    void addInvoice(InvoiceRequest request);
    void updateInvoice(Invoice update);
    List<Invoice> getAll();
    List<Invoice> findByMonth(Integer month);
    List<Invoice> findByYear(Integer year);
    Invoice findTop1ByOrderByLastModifiedDesc();
    Invoice findByMonthAndYearAndLogisticName (Integer month, Integer year, String logisticName);
//    List<String> getLogisticName(String logisticName);
}
