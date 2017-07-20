/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.entity.MailSender;
import com.gdn.scm.bolivia.entity.PageClass;
import com.gdn.scm.bolivia.services.AWBPagingService;
import com.gdn.scm.bolivia.services.AWBService;
import com.gdn.scm.bolivia.services.SimpleOrderManager;
import com.gdn.scm.bolivia.services.XMessageService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sofrie.zumaytis
 */
@RestController
public class AWBController {

    @Autowired
    AWBService awbService;

    @Autowired
    AWBPagingService awbPagingService;

    @Autowired
    SimpleOrderManager simpleOrderManager;

    @Autowired
    XMessageService xMessageService;

    @Autowired
    MailSender mail;

    public Page<AWB> awbs;
    PageClass pageClass;

    @CrossOrigin
    @RequestMapping(value = "/api/awb/{awb}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> listAWBOne(@PathVariable("awb") String awb) {
        return awbService.getByAwbNumber(awb);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/awb", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> listAWB() {
        return awbService.getAll();
    }

    //filter By month
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filtermonth/{month}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAWBByMonth(@PathVariable("month") String month, Pageable pageable) {
        awbs = awbService.findByMonth(month, pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    //filter By status
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterstatus/{status}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAWBByStatus(@PathVariable("status") String status, Pageable pageable) {
        awbs = awbService.findByStatus(status, pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    //filter By year
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filteryear/{year}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAWBByYear(@PathVariable("year") String year, Pageable pageable) {
        awbs = awbService.findByYear(year, pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    //filter By logisticName
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterlogisticName/{logisticName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAWBByLogisticName(@PathVariable("logisticName") String logisticName, Pageable pageable) {
        awbs = awbService.findByLogisticName(logisticName, pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    //filter By awbNumber
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterAwbNumber/{AwbNumber}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBByAwbNumber(@PathVariable("AwbNumber") String AwbNumber) {
        return awbService.getByAwbNumber(AwbNumber);
    }

    //filter By merchantCode
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterMerchantCode/{merchantCode}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterMerchantCode(@PathVariable("merchantCode") String merchantCode) {
        return awbService.getByMerchantCode(merchantCode);
    }

    //filter By gdnRef
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterGdnRef/{gdnRef}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterGdnRef(@PathVariable("gdnRef") String gdnRef) {
        return awbService.getByGdnRef(gdnRef);
    }

    //filter all
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filter/{month}/{year}/{logisticName}/{awbNumber}/{reconStatus}/{merchantCode}/{gdnRef}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAll(@PathVariable("month") String month, @PathVariable("year") String year, @PathVariable("logisticName") String logisticName, @PathVariable("awbNumber") String awbNumber, @PathVariable("reconStatus") String reconStatus, @PathVariable("merchantCode") String merchantCode, @PathVariable("gdnRef") String gdnRef) {
        return awbService.filterAll(month, year, logisticName, awbNumber, reconStatus, merchantCode, gdnRef);
    }

    //get all year
    @CrossOrigin
    @RequestMapping(value = "/api/awb/status", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllYear() {
        return awbService.selectAllYear();
    }

    @CrossOrigin
    @RequestMapping(value = "/api/awb/awbs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> listAWBPage(Pageable pageable) {
        awbs = awbService.findAll(pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/awb/awbnumbers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    PageClass listAWBPageByAWBNumber() {
        System.out.println("Total page " + pageClass.getTotal_page());
        System.out.println("page " + pageClass.getPage());
        System.out.println("Item page " + pageClass.getItem_page());
        return pageClass;
    }

    @CrossOrigin
    @RequestMapping(value = "/email", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    void sendMail() {

        try {
            mail.sendMail("sofrie.zumaytis@gdn-commerce.com", "sofriesilero.zumaytis@gmail.com", "tes", "coba kirim email");
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            Date today = new Date();
//            SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
//            String date = DATE_FORMAT.format(today);
//            simpleOrderManager.sendMailPickuptoXMessage("A1 ", "D:/Data/AWB.xlsx", "haha", date);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/asc", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> sortByAWBNumberAsc(Pageable pageable) {
        awbs=awbService.sortByAWBNumberAsc(pageable);
        return awbs;
    }
}
