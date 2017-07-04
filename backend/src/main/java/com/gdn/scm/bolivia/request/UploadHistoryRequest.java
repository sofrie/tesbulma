/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.request;

import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_JUMLAH_TAGIHAN;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_LAST_MODIFIED;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_LOGISTIC;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_OK;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_PROBLEM_EXIST;
import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_YEAR;
import java.util.Date;
import javax.persistence.Column;

/**
 *
 * @author sofrie.zumaytis
 */
public class UploadHistoryRequest {

    private String month;

    private String year;    

    private String logistic;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLogistic() {
        return logistic;
    }

    public void setLogistic(String logistic) {
        this.logistic = logistic;
    }

   
}
