/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sofrie.zumaytis
 */
@Entity
@Table(name = LogisticProvider.TABLE_NAME)
@Getter
@Setter
public class LogisticProvider {

    public static final String TABLE_NAME = "BLV_LOGISTIC_PROVIDER";

    public static final String COLUMN_ID = "ID";
    
    public static final String COLUMN_LOGISTIC_CODE = "LOGISTIC_CODE";
    public static final String COLUMN_LOGISTIC_NAME = "LOGISTIC_NAME";
    public static final String COLUMN_STATUS = "STATUS";
    public static final String COLUMN_DISCOUNT = "DISCOUNT";
    public static final String COLUMN_VAT = "VAT";

    
    @Column(name = COLUMN_ID, nullable = false)
    @Id
    private String id;
    
    @Column(name = COLUMN_LOGISTIC_CODE, nullable = false)
    private String logisticCode;

    @Column(name = COLUMN_LOGISTIC_NAME, nullable = false)
    private String logisticName;

    @Column(name = COLUMN_STATUS, nullable = false)
    private String status;

    @Column(name = COLUMN_DISCOUNT, nullable = true)
    private Long discount;

    @Column(name = COLUMN_VAT, nullable = true)
    private Long vat;

    public LogisticProvider(String logisticCode, String logisticName, String status, Long discount, Long vat) {
        this.logisticCode = logisticCode;
        this.logisticName = logisticName;
        this.status = status;
        this.discount = discount;
        this.vat = vat;
    }

    public LogisticProvider() {
    }
}
