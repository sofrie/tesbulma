/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.request.InvoiceRequest;
import com.gdn.scm.bolivia.request.UploadHistoryRequest;
import com.gdn.scm.bolivia.services.InvoiceService;
import com.gdn.scm.bolivia.services.UploadHistoryService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sofrie.zumaytis
 */
@RestController
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @CrossOrigin
    @RequestMapping(value = "/api/invoice", method = RequestMethod.POST)
    public void createInvoice(@RequestBody InvoiceRequest request) {
        
        request.setId(UUID.randomUUID().toString());
        invoiceService.addInvoice(request);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/invoice", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Invoice> getAllInvoice() {
        return invoiceService.getAll();
    }

//    @CrossOrigin
//    @RequestMapping(value = "/api/invoice/{month}/{year}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Invoice> getAllByMonthYear(@PathVariable("month") String month) {
//        return invoiceService.findByMonth(month);
//    }
//
//    @CrossOrigin
//    @RequestMapping(value = "/api/uploadHistory/year/{year}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Invoice> filterByYear(@PathVariable("year") String year) {
//        return invoiceService.findByYear(year);
//    }
//
//    sortByAWBNumberAsc
   
}