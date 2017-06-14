/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sofrie.zumaytis
 */
@Entity
@Table(name = AWB.TABLE_NAME)
@Getter
@Setter
public class AWB {
    public static final String TABLE_NAME = "BLV_AWB";

    public static final String COLUMN_ID = "ID";
        
     public static final String COLUMN_MONTH = "MONTH";
    public static final String COLUMN_YEAR = "YEAR";
    public static final String COLUMN_LOGISTIC_NAME = "LOGISTIC_NAME";
    public static final String COLUMN_AWB_NUMBER = "AWB_NUMBER";
    public static final String COLUMN_RECON_STATUS = "RECON_STATUS";
    public static final String COLUMN_MERCHANT_CODE = "MERCHANT_CODE";
    public static final String COLUMN_GDN_REF = "GDN_REF";

//    
//    @Column(name = COLUMN_ID, nullable = false)
//    @Id
//    private String id;
    
    @Column(name = COLUMN_MONTH, nullable = false)
    private String month;

    @Column(name = COLUMN_YEAR, nullable = false)
    private String year;

    @Column(name = COLUMN_LOGISTIC_NAME, nullable = false)
    private String logisticName;

    @Id
    @Column(name = COLUMN_AWB_NUMBER, nullable = false)
    private String awbNumber;

    @Column(name = COLUMN_RECON_STATUS, nullable = false)
    private String reconStatus;
    
    @Column(name = COLUMN_MERCHANT_CODE, nullable = false)
    private String merchantCode;
    
    @Column(name = COLUMN_GDN_REF, nullable = false)
    private String gdnRef;

    public AWB(String month, String year, String logisticName, String awbNumber, String reconStatus, String merchantCode, String gdnRef) {
  
        this.month = month;
        this.year = year;
        this.logisticName = logisticName;
        this.awbNumber = awbNumber;
        this.reconStatus = reconStatus;
        this.merchantCode = merchantCode;
        this.gdnRef = gdnRef;
    }

    public AWB() {
    }

      
    
}
