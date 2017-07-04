/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.services.AWBService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
     
     @CrossOrigin
    @RequestMapping(value = "/api/awb", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> listAWB() {
        return awbService.getAll();
    }
    
    //filter By month
    @CrossOrigin
    @RequestMapping(value = "/api/awb/{month}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBByMonth(@PathVariable("month") String month) {
        return awbService.getByMonth(month);
    }
    
    //filter By status
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterstatus/{status}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBByStatus(@PathVariable("status") String status) {
        return awbService.getByStatus(status);
    }
    
    //filter By year
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filteryear/{year}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBByYear(@PathVariable("year") String year) {
        return awbService.getByYear(year);
    }
    
    //filter By logisticName
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterlogisticName/{logisticName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBByLogisticName(@PathVariable("logisticName") String logisticName) {
        return awbService.getByLogisticName(logisticName);
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
}
