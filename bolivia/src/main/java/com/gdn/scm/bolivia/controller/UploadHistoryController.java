/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.request.LogisticProviderRequest;
import com.gdn.scm.bolivia.request.UploadHistoryRequest;
import com.gdn.scm.bolivia.services.UploadHistoryService;
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
public class UploadHistoryController {

    @Autowired
    UploadHistoryService uploadHistoryService;

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory", method = RequestMethod.POST)
    public void createUploadHistory(@RequestBody UploadHistoryRequest request) {
        uploadHistoryService.addUploadHistory(request);
        //return logistic;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> getAllUploadHistory() {
        return uploadHistoryService.getAll();
        //return logistic;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/month/{month}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> filterByMonth(@PathVariable("month") String month) {
        return uploadHistoryService.getByMonth(month);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/year/{year}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> filterByYear(@PathVariable("year") String year) {
        return uploadHistoryService.getByYear(year);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/logistic/{logistic}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> filterByLogistic(@PathVariable("logistic") String logistic) {
        return uploadHistoryService.getByLogisticName(logistic);
    }
    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/status/{status}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> filterByStatus(@PathVariable("status") String status) {
        return uploadHistoryService.getByStatus(status);
    }
    
    //select list in invoice
    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/list/month", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllMonth() {
        return uploadHistoryService.getAllMonth();
    }
    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/list/year", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllYear() {
        return uploadHistoryService.getAllYear();
    }
}
