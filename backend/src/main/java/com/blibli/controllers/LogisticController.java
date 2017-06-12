/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blibli.controllers;

import com.blibli.forms.CreateLogistic;
import com.blibli.forms.UpdateLogistic;
import com.blibli.models.Logistic;
import com.blibli.models.Paging;
import com.blibli.models.Response;
import com.blibli.repository.LogisticRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sofri
 */
@RestController
public class LogisticController {

    public List<Logistic> daftarLogistik = new ArrayList<>();
    public Logistic l = new Logistic();
//    @Autowired LogisticRepository logisticRepository;
    //api/logistics/

    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/logistics", method = RequestMethod.GET)
    public Response<Logistic> list(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "item_page", defaultValue = "100") int item_page) {
        Response<Logistic> response = new Response<>();
        response.setCode(200);
        response.setStatus("OK");
        response.setList(Arrays.asList(
                new Logistic(1, "A Logistic", "Active", 5.0, 1.0),
                new Logistic(2, "B Logistic", "Active", 2.25, 1.0),
                new Logistic(2, "C Logistic", "Active", 3.15, 1.0),
                new Logistic(2, "D Logistic", "Inactive", 1.75, 1.0)
        ));
        response.setPaging(
                new Paging(page, item_page, 33)
        );
        return response;
    }

    //get data logistic aja, ngga pake data page sama item page
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/logisticss", method = RequestMethod.GET)
    public String listlogistik() {
        List<Logistic> response = Arrays.asList(
                new Logistic(1, "A Logistic", "Active", 5.0, 1.0),
                new Logistic(2, "B Logistic", "Active", 2.25, 1.0),
                new Logistic(3, "C Logistic", "Active", 3.15, 1.0),
                new Logistic(4, "D Logistic", "Inactive", 1.75, 1.0)
        );
        if (daftarLogistik.size() <= 0) {
            for (int i = 0; i < 4; i++) {
                daftarLogistik.add(response.get(i));
            }
        }
        String json = new Gson().toJson(daftarLogistik);
        return json;
    }

    //sort logistic by status
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/logisticss/{status}", method = RequestMethod.GET)
    public String sortLogistik(@PathVariable("status") String status) {
//        List<Logistic> sorting=logisticRepository.findByStatus(status);
        List<Logistic> sorting = new ArrayList<>();
        if (status.equals("All")) {
            String json = new Gson().toJson(daftarLogistik);
            return json;
        } else {
            for (int i = 0; i < daftarLogistik.size(); i++) {
                if (daftarLogistik.get(i).getStatus().equals(status)) {
                    sorting.add(daftarLogistik.get(i));
                }
            }
            String json = new Gson().toJson(sorting);
            return json;
        }
    }

    //api/logistics/{id}
    //get specific logistic
    @RequestMapping(value = "/api/logistics/{id}", method = RequestMethod.GET)
    public String getId(@PathVariable("id") String id) {
        String response = "JNE";
        return response;
    }

    //api/logistics
    //create data
    @RequestMapping(value = "/api/logistics", method = RequestMethod.POST)
    public Response<Logistic> create(@RequestBody CreateLogistic request) {
        Response<Logistic> response = new Response<>();
        response.setCode(200);
        response.setStatus("OK");
        Logistic logistic = new Logistic(request.getId(), request.getName());
        response.setData(logistic);
        return response;

        //aslinya
        //gunakan try catch jika ada error
        //akan lebih baik jika terdapat validasi checking
        //lihat method validate
//        try {
//            Response<Logistic> response = new Response<>();
//            response.setCode(200);
//            response.setStatus("OK");
//            Logistic logistic = new Logistic(request.getId(), request.getName());
//            response.setData(logistic);
//            return response;
//        } 
//        catch (IllegalArgumentException throwable) {
//            Response<Logistic> response = new Response<>();
//            response.setCode(400);
//            response.setStatus(throwable.getMessage());
//            return response;
//        } 
//        catch (Throwable throwable) {
//            Response<Logistic> response = new Response<>();
//            response.setCode(500);
//            response.setStatus(throwable.getMessage());
//            return response;
//        }
    }

    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/logisticss", method = RequestMethod.POST)
    public String createLogistic(@RequestBody CreateLogistic request) {
//		Response<Logistic> response=new Response<>();
//		response.setCode(200);
//		response.setStatus("OK");
        Logistic logistic = new Logistic(request.getId(), request.getName(), request.getStatus(), request.getDiscount(), request.getVat());
//		response.setData(logistic);
        daftarLogistik.add(logistic);
        String json = new Gson().toJson(daftarLogistik);
        return json;
    }

    //update
    @RequestMapping(value = "/api/logistics/{id}", method = RequestMethod.PUT)
    public Response<Logistic> update(@PathVariable("id") Integer id, @RequestBody UpdateLogistic request) {
        Response<Logistic> response = new Response<>();
        response.setCode(200);
        response.setStatus("OK");
        Logistic logistic = new Logistic(id, request.getName());
        response.setData(logistic);
        return response;
    }

    //set update logistic
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/logisticsss/{name}", method = RequestMethod.GET)
    public void setLogistik(@PathVariable("name") String name) {
        l = new Logistic();
        for (int i = 0; i < daftarLogistik.size(); i++) {
            if (daftarLogistik.get(i).getName().equals(name)) {
                l = daftarLogistik.get(i);
            }
        }
//        String json = new Gson().toJson(l);
//        return json;
    }
    
    //return hasil logistic yg uda di set
    @CrossOrigin(origins = "http://localhost:8085")
    @RequestMapping(value = "/api/logisticsss", method = RequestMethod.GET)
    public String returnLogistik() {        
        String json = new Gson().toJson(l);
        return json;
    }

    //update logistik
    @RequestMapping(value = "/api/logisticss/{id}", method = RequestMethod.PUT)
    public Response<Logistic> updateLogistik(@PathVariable("id") Integer id, @RequestBody UpdateLogistic request) {
        Response<Logistic> response = new Response<>();
        response.setCode(200);
        response.setStatus("OK");
        Logistic logistic = new Logistic(id, request.getName());
        response.setData(logistic);
        return response;
    }

    //delete
    @RequestMapping(value = "/api/logistics/{id}", method = RequestMethod.DELETE)
    public Response<Logistic> delete(@PathVariable("id") Integer id, @RequestBody UpdateLogistic request) {
        Response<Logistic> response = new Response<>();
        response.setCode(200);
        response.setStatus("OK");
        Logistic logistic = new Logistic(id, request.getName());
        response.setData(logistic);
        return response;
    }

    public void validateCreateRequest(CreateLogistic request) {
        if (request.getId() == null) {
            throw new IllegalArgumentException("Id tidak boleh kosong");
        }
        if (request.getName() == null) {
            throw new IllegalArgumentException("Name tidak boleh kosong");
        }
    }
}
