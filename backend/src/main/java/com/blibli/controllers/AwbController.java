/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blibli.controllers;

import com.blibli.models.Logistic;
import com.blibli.models.Paging;
import com.blibli.models.Response;
import com.blibli.models.AWB;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sofrie.zumaytis
 */
@RestController
public class AwbController {
     //api/awb/
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/awb", method = RequestMethod.GET)
    public String listlogistik() {
        List<AWB> response = Arrays.asList(
                new AWB("AWB12345","January",2017,"A Logistic","OK","MERCH-CODE-0001","GDN-REF-ABC1"),
               new AWB("AWB23456","January",2017,"A Logistic","Problem Exist","MERCH-CODE-0001","GDN-REF-ABC1"),
               new AWB("AWB34567","January",2017,"A Logistic","Problem Exist","MERCH-CODE-0001","GDN-REF-ABC1"),
               new AWB("AWB45678","January",2017,"A Logistic","OK","MERCH-CODE-0001","GDN-REF-ABC1"),
               new AWB("AWB56789","January",2017,"A Logistic","Problem Exist","MERCH-CODE-0001","GDN-REF-ABC1")
        );      
        Gson gson=new Gson();
        gson.toJson(response);
        String json = new Gson().toJson(response );
        return json;
    }
}
