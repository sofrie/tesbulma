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
    List<Invoice> getAll();
    List<Invoice> findByMonth(String month);
    List<Invoice> findByYear(String year);
//    List<String> getLogisticName(String logisticName);
}
