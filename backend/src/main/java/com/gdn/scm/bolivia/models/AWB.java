/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.models;

/**
 *
 * @author sofri
 */
public class AWB {
    private String id;
    private String month;
    private Integer year;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    private String name;
    private String status;
    private String merchantcode;
    private String gdnref;
    
    /*
    private Integer correct;
    private Integer wrong;
    private Integer status;//status AWB nya not approval, checked, approval
    private Integer isDeleted;
    private Double discount;
    private Double vAT;
    private Double subtotal;
    private Double grandTotal;
    private String batch;

    public AWB(String id, Integer correct, Integer wrong, Integer status, Integer isDeleted, String batch) {
        this.id = id;
        this.correct = correct;
        this.wrong = wrong;
        this.status = status;
        this.isDeleted = isDeleted;
        this.batch = batch;
    }

    
    public AWB(String id, Integer correct, Integer wrong, Integer status, Integer isDeleted, Double discount, Double vAT, Double subtotal, Double grandTotal, String batch) {
        this.id = id;
        this.correct = correct;
        this.wrong = wrong;
        this.status = status;
        this.isDeleted = isDeleted;
        this.discount = discount;
        this.vAT = vAT;
        this.subtotal = subtotal;
        this.grandTotal = grandTotal;
        this.batch = batch;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        this.correct = correct;
    }

    public Integer getWrong() {
        return wrong;
    }

    public void setWrong(Integer wrong) {
        this.wrong = wrong;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getvAT() {
        return vAT;
    }

    public void setvAT(Double vAT) {
        this.vAT = vAT;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMerchantcode() {
        return merchantcode;
    }

    public void setMerchantcode(String merchantcode) {
        this.merchantcode = merchantcode;
    }

    public String getGdnref() {
        return gdnref;
    }

    public void setGdnref(String gdnref) {
        this.gdnref = gdnref;
    }

    public AWB(String id, String month, Integer year, String name, String status, String merchantcode, String gdnref) {
        this.id = id;
        this.month = month;
        this.year = year;
        this.name = name;
        this.status = status;
        this.merchantcode = merchantcode;
        this.gdnref = gdnref;
    }
}
