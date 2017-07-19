/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.repository.InvoiceRepository;
import com.gdn.scm.bolivia.request.InvoiceRequest;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class InvoiceServiceImpl implements InvoiceService{
    
    @Autowired
    InvoiceRepository invoiceRepository; 
    

    @Override
    public List<Invoice> findByMonth(String month) {
        return invoiceRepository.findByMonth(month);
    }

    @Override
    public List<Invoice> findByYear(String year) {
        return invoiceRepository.findByYear(year);
    }

//    @Override
//    public List<String> getLogisticName(String logisticName) {
//        return invoiceRepository.getLogisticName(logisticName);
//    }

    @Override
    public void addInvoice(InvoiceRequest request) {
        Invoice invoice = new Invoice();
        BeanUtils.copyProperties(request, invoice);
        invoiceRepository.save(invoice);
    }

    @Override
    public List<Invoice> getAll() {
        return invoiceRepository.findAll();
    }
    
}
