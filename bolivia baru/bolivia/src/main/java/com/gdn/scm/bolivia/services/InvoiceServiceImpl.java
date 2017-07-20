/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.repository.InvoiceRepository;
import com.gdn.scm.bolivia.repository.LogisticProviderRepository;
import com.gdn.scm.bolivia.request.InvoiceRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;
    
    @Autowired
    LogisticProviderRepository logisticProviderRepository;

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
        invoice.setId(UUID.randomUUID().toString());
        invoice.setStatusInvoice("Open");
        
        Date today = new Date();
         Timestamp timestamp=new Timestamp(today.getTime());
        String date = timestamp.toString();
        System.out.println("Today " + date);
        invoice.setLastModified(timestamp);
        
        invoice.setLogisticProvider(logisticProviderRepository.findByLogisticName(invoice.getLogisticName()));
        // invoice.setFirstUploadDate(firstUploadDate);
        System.out.println("Id Invoice ----- " + invoice.getId());
        try {
            invoiceRepository.save(invoice);
        } catch (Exception e) {
            System.out.println("gagal invoice");
            e.printStackTrace();;
        }
    }

    @Override
    public List<Invoice> getAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice findTop1ByOrderByLastModifiedDesc() {
        return invoiceRepository.findTop1ByOrderByLastModifiedDesc();
    }

}
