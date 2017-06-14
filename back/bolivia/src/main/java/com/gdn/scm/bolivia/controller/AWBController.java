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
     
     @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> listAWB() {
        return awbService.GetAll();
    }
    
    //filter by month
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb/{month}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBbyMonth(@PathVariable("month") String month) {
        return awbService.GetbyMonth(month);
    }
    
    //filter by status
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb/filterstatus/{status}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBbyStatus(@PathVariable("status") String status) {
        return awbService.GetbyStatus(status);
    }
    
    //filter by year
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb/filteryear/{year}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBbyYear(@PathVariable("year") String year) {
        return awbService.GetbyYear(year);
    }
    
    //filter by logisticName
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb/filterlogisticName/{logisticName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBbyLogisticName(@PathVariable("logisticName") String logisticName) {
        return awbService.GetbyLogisticName(logisticName);
    }
    
    //filter by awbNumber
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb/filterAwbNumber/{AwbNumber}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBbyAwbNumber(@PathVariable("AwbNumber") String AwbNumber) {
        return awbService.GetByAwbNumber(AwbNumber);
    }
    
    //filter by merchantCode
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb/filterMerchantCode/{merchantCode}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterMerchantCode(@PathVariable("merchantCode") String merchantCode) {
        return awbService.GetByMerchantCode(merchantCode);
    }
    
    //filter by gdnRef
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb/filterGdnRef/{gdnRef}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterGdnRef(@PathVariable("gdnRef") String gdnRef) {
        return awbService.GetByGdnRef(gdnRef);
    }
    
    //filter all
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb/filter/{month}/{year}/{logisticName}/{awbNumber}/{reconStatus}/{merchantCode}/{gdnRef}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAll(@PathVariable("month") String month, @PathVariable("year") String year, @PathVariable("logisticName") String logisticName, @PathVariable("awbNumber") String awbNumber, @PathVariable("reconStatus") String reconStatus, @PathVariable("merchantCode") String merchantCode, @PathVariable("gdnRef") String gdnRef) {
        return awbService.filterAll(month, year, logisticName, awbNumber, reconStatus, merchantCode, gdnRef);
    }
    
    
    
    //get all year
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb/status", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllYear() {
        return awbService.selectAllYear();
    }
}
