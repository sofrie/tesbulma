/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.repository.LogisticProviderRepository;
import com.gdn.scm.bolivia.request.LogisticProviderRequest;
import com.gdn.scm.bolivia.services.LogisticProviderService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
public class LogisticProviderController {

    @Autowired
    LogisticProviderRepository logisticProviderRepository;

    @Autowired
    LogisticProviderService logisticProviderService;

    public List<LogisticProvider> daftarLogistik = new ArrayList<>();
    public LogisticProvider l = new LogisticProvider();

    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/logistics", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LogisticProvider> listlogistik() {
        return logisticProviderService.GetAll();
    }

    //sort logistic by status
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/logistics/{status}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LogisticProvider> sortLogistik(@PathVariable("status") String status) {
        return logisticProviderService.GetbyStatus(status);
    }

    //add LogisticProvider
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/logisticsss", method = RequestMethod.POST)
    public void createLogistic(@RequestBody LogisticProviderRequest request) {
        logisticProviderService.addLogisticProvider(request);
        //return logistic;
    }
}
