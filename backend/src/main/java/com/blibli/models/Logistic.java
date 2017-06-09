/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blibli.models;

/**
 *
 * @author sofri
 */
public class Logistic {
    private Integer id; 
    private String name;
    private String status;
    private Double discount;
    private Double vat;

    public Logistic() {
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }
    public Logistic(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public Logistic(Integer id, String name, String status, Double discount, Double vat) {
        this.id = id;
        this.name = name;
        this.status=status;
        this.discount=discount;
        this.vat=vat;
    }    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
