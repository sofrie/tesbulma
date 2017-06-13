/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.request;

import static com.gdn.scm.bolivia.entity.AWB.COLUMN_AWB_NUMBER;
import static com.gdn.scm.bolivia.entity.AWB.COLUMN_GDN_REF;
import static com.gdn.scm.bolivia.entity.AWB.COLUMN_LOGISTIC_NAME;
import static com.gdn.scm.bolivia.entity.AWB.COLUMN_MERCHANT_CODE;
import static com.gdn.scm.bolivia.entity.AWB.COLUMN_RECON_STATUS;
import static com.gdn.scm.bolivia.entity.AWB.COLUMN_YEAR;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author sofrie.zumaytis
 */
public class AWBRequest {
    private String month;
    private String year;
    private String logisticName;
    private String awbNumber;
    private String reconStatus;
    private String merchantCode;
    private String gdnRef;

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

    public String getLogisticName() {
        return logisticName;
    }

    public void setLogisticName(String logisticName) {
        this.logisticName = logisticName;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    public String getReconStatus() {
        return reconStatus;
    }

    public void setReconStatus(String reconStatus) {
        this.reconStatus = reconStatus;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getGdnRef() {
        return gdnRef;
    }

    public void setGdnRef(String gdnRef) {
        this.gdnRef = gdnRef;
    }
    
    
}
