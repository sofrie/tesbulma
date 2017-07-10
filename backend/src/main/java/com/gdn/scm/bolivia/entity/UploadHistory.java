/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import java.util.Date;
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
@Table(name = UploadHistory.TABLE_NAME)
@Getter
@Setter
public class UploadHistory {

    public static final String TABLE_NAME = "BLV_UPLOAD_HISTORY";

    public static final String COLUMN_ID = "ID";

    public static final String COLUMN_MONTH = "MONTH";
    public static final String COLUMN_YEAR = "YEAR";
    public static final String COLUMN_OK = "OK";
    public static final String COLUMN_PROBLEM_EXIST = "PROBLEM_EXIST";
    public static final String COLUMN_JUMLAH_TAGIHAN = "JUMLAH_TAGIHAN";
    public static final String COLUMN_LOGISTIC = "MERCHANT_LOGISTIC";
    public static final String COLUMN_STATUS = "STATUS";
    public static final String COLUMN_LAST_MODIFIED = "LAST_MODIFIED";

    @Id
    @Column(name = COLUMN_ID)
    private String id;

    @Column(name = COLUMN_MONTH, nullable = false)
    private String month;

    @Column(name = COLUMN_YEAR, nullable = false)
    private String year;

    @Column(name = COLUMN_OK, nullable = false)
    private String ok;

    @Column(name = COLUMN_PROBLEM_EXIST, nullable = false)
    private String problemExist;

    @Column(name = COLUMN_JUMLAH_TAGIHAN, nullable = false)
    private String jumlahTagihan;

    @Column(name = COLUMN_LOGISTIC, nullable = false)
    private String logistic;
    
    @Column(name = COLUMN_STATUS, nullable = false)
    private String status;

    @Column(name = COLUMN_LAST_MODIFIED, nullable = true)
    private String last_modified;

    public UploadHistory(String id, String month, String year, String ok, String problemExist, String jumlahTagihan, String logistic, String status, String last_modified) {
        this.id = id;
        this.month = month;
        this.year = year;
        this.ok = ok;
        this.problemExist = problemExist;
        this.jumlahTagihan = jumlahTagihan;
        this.logistic = logistic;
        this.status = status;
        this.last_modified = "-";
    }

    public UploadHistory() {
    }

    
}
