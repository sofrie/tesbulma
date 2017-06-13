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
}
