/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.apache.poi.ss.usermodel.Row;

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

    public static final String COLUMN_AWB_NUMBER = "AWB_NUMBER";
    public static final String COLUMN_RECON_STATUS = "RECON_STATUS";
    public static final String COLUMN_GDN_REF = "GDN_REF";
    public static final String COLUMN_INSURED_AMOUNT = "INSURED_AMOUNT";

    public static final String COLUMN_WEIGHT_SYSTEM = "WEIGHT_SYSTEM";
    public static final String COLUMN_WEIGHT_LOGISTIC = "WEIGHT_LOGISTIC";
    public static final String COLUMN_WEIGHT_APPLIED = "WEIGHT_APPLIED";
    public static final String COLUMN_WEIGHT_COMMENT = "WEIGHT_COMMENT";

    public static final String COLUMN_PRICE_SYSTEM = "PRICE_SYSTEM";
    public static final String COLUMN_PRICE_LOGISTIC = "PRICE_LOGISTIC";
    public static final String COLUMN_PRICE_APPLIED = "PRICE_APPLIED";
    public static final String COLUMN_PRICE_COMMENT = "PRICE_COMMENT";

    public static final String COLUMN_OTHER_CHARGE_SYSTEM = "OTHER_CHARGE_SYSTEM";
    public static final String COLUMN_OTHER_CHARGE_LOGISTIC = "OTHER_CHARGE_LOGISTIC";
    public static final String COLUMN_OTHER_CHARGE_APPLIED = "OTHER_CHARGE_APPLIED";
    public static final String COLUMN_OTHER_CHARGE_COMMENT = "OTHER_CHARGE_COMMENT";

    public static final String COLUMN_GIFT_WRAP_CHARGE_SYSTEM = "GIFT_WRAP_CHARGE_SYSTEM";
    public static final String COLUMN_GIFT_WRAP_CHARGE_LOGISTIC = "GIFT_WRAP_CHARGE_LOGISTIC";
    public static final String COLUMN_GIFT_WRAP_CHARGE_APPLIED = "GIFT_WRAP_CHARGE_APPLIED";
    public static final String COLUMN_GIFT_WRAP_CHARGE_COMMENT = "GIFT_WRAP_CHARGE_COMMENT";

    public static final String COLUMN_INSURANCE_CHARGE_SYSTEM = "INSURANCE_CHARGE_SYSTEM";
    public static final String COLUMN_INSURANCE_CHARGE_LOGISTIC = "INSURANCE_CHARGE_LOGISTIC";
    public static final String COLUMN_INSURANCE_CHARGE_APPLIED = "INSURANCE_CHARGE_APPLIED";
    public static final String COLUMN_INSURANCE_CHARGE_COMMENT = "INSURANCE_CHARGE_COMMENT";

    public static final String COLUMN_TOTAL_CHARGE_SYSTEM = "TOTAL_CHARGE_SYSTEM";
    public static final String COLUMN_TOTAL_CHARGE_LOGISTIC = "TOTAL_CHARGE_LOGISTIC";
    public static final String COLUMN_TOTAL_CHARGE_APPLIED = "TOTAL_CHARGE_APPLIED";
    public static final String COLUMN_TOTAL_CHARGE_COMMENT = "TOTAL_CHARGE_COMMENT";

    public static final String COLUMN_FAILURE = "FAILURE";
    public static final String COLUMN_NOTES = "NOTES";
    public static final String COLUMN_NAMA_PENGIRIM = "NAMA_PENGIRIM";
    public static final String COLUMN_MERCHANT_CODE = "MERCHANT_CODE";
    public static final String COLUMN_MERCHANT_NAME = "MERCHANT_NAME";

    public static final String COLUMN_NAMA_PENGIRIM_API = "NAMA_PENGIRIM_API";
    public static final String COLUMN_NAMA_PENGIRIM_SYSTEM = "NAMA_PENGIRIM_SYSTEM";

    public static final String COLUMN_ALAMAT_PENGIRIM_API = "ALAMAT_PENGIRIM_API";
    public static final String COLUMN_ALAMAT_PENGIRIM_SYSTEM = "ALAMAT_PENGIRIM_SYSTEM";

    public static final String COLUMN_KODE_ORIGIN_API = "KODE_ORIGIN_API";
    public static final String COLUMN_KODE_ORIGIN_SYSTEM = "KODE_ORIGIN_SYSTEM";

    public static final String COLUMN_NAMA_PENERIMA_API = "NAMA_PENERIMA_API";
    public static final String COLUMN_NAMA_PENERIMA_SYSTEM = "_NAMA_PENERIMA_SYSTEM";

    public static final String COLUMN_ALAMAT_PENERIMA_API = "ALAMAT_PENERIMA_API";
    public static final String COLUMN_ALAMAT_PENERIMA_SYSTEM = "ALAMAT_PENERIMA_SYSTEM";

    public static final String COLUMN_KODE_DESTINASI_API = "KODE_DESTINASI_API";
    public static final String COLUMN_KODE_DESTINASI_SYSTEM = "KODE_DESTINASI_SYSTEM ";

    //Finance Original Ship Cost 
    public static final String COLUMN_FOCS_AMOUNT = "FOCS_AMOUNT";
    //Finance Original Ship Cost Adjustment 
    public static final String COLUMN_FOCSA_AMOUNT = "FOCSA_AMOUNT";

    public static final String COLUMN_SHIPPING_COST = "SHIPPING_COST";
    public static final String COLUMN_SHIP_COST = "SHIP_COST";

    public static final String COLUMN_MONTH = "MONTH";
    public static final String COLUMN_YEAR = "YEAR";
    public static final String COLUMN_LOGISTIC_NAME = "LOGISTIC_NAME";

    public Integer counter=0;
    public String uploadHistoryNumber;
    
    
    @Id
    @Column(name = COLUMN_AWB_NUMBER, nullable = false)
    private String awbNumber;

    @Column(name = COLUMN_RECON_STATUS, nullable = false)
    private String reconStatus;

    @Column(name = COLUMN_GDN_REF, nullable = false)
    private String gdnRef;

    @Column(name = COLUMN_INSURED_AMOUNT, nullable = true)
    private String insuredAmount;

    @Column(name = COLUMN_WEIGHT_SYSTEM, nullable = true)
    private BigDecimal weightSystem;
    @Column(name = COLUMN_WEIGHT_LOGISTIC, nullable = true)
    private BigDecimal weightLogistic;
    @Column(name = COLUMN_WEIGHT_APPLIED, nullable = true)
    private BigDecimal weightApplied;
    @Column(name = COLUMN_WEIGHT_COMMENT, nullable = true)
    private String weightComment;

    @Column(name = COLUMN_PRICE_SYSTEM, nullable = true)
    private BigDecimal priceSystem;
    @Column(name = COLUMN_PRICE_LOGISTIC, nullable = true)
    private BigDecimal priceLogistic;
    @Column(name = COLUMN_PRICE_APPLIED, nullable = true)
    private BigDecimal priceApplied;
    @Column(name = COLUMN_PRICE_COMMENT, nullable = true)
    private String priceComment;

    @Column(name = COLUMN_OTHER_CHARGE_SYSTEM, nullable = true)
    private BigDecimal otherChargeSystem;
    @Column(name = COLUMN_OTHER_CHARGE_LOGISTIC, nullable = true)
    private BigDecimal otherChargeLogistic;
    @Column(name = COLUMN_OTHER_CHARGE_APPLIED, nullable = true)
    private BigDecimal otherChargeApplied;
    @Column(name = COLUMN_OTHER_CHARGE_COMMENT, nullable = true)
    private String otherChargeComment;

    @Column(name = COLUMN_GIFT_WRAP_CHARGE_SYSTEM, nullable = true)
    private BigDecimal giftWrapChargeSystem;
    @Column(name = COLUMN_GIFT_WRAP_CHARGE_LOGISTIC, nullable = true)
    private BigDecimal giftWrapChargeLogistic;
    @Column(name = COLUMN_GIFT_WRAP_CHARGE_APPLIED, nullable = true)
    private BigDecimal giftWrapChargeApplied;
    @Column(name = COLUMN_GIFT_WRAP_CHARGE_COMMENT, nullable = true)
    private String giftWrapChargeComment;

    @Column(name = COLUMN_INSURANCE_CHARGE_SYSTEM, nullable = true)
    private BigDecimal insuranceChargeSystem;
    @Column(name = COLUMN_INSURANCE_CHARGE_LOGISTIC, nullable = true)
    private BigDecimal insuranceChargeLogistic;
    @Column(name = COLUMN_INSURANCE_CHARGE_APPLIED, nullable = true)
    private BigDecimal insuranceChargeApplied;
    @Column(name = COLUMN_INSURANCE_CHARGE_COMMENT, nullable = true)
    private String insuranceChargeComment;

    @Column(name = COLUMN_TOTAL_CHARGE_SYSTEM, nullable = true)
    private BigDecimal totalChargeSystem;
    @Column(name = COLUMN_TOTAL_CHARGE_LOGISTIC, nullable = true)
    private BigDecimal totalChargeLogistic;
    @Column(name = COLUMN_TOTAL_CHARGE_APPLIED, nullable = true)
    private BigDecimal totalChargeApplied;
    @Column(name = COLUMN_TOTAL_CHARGE_COMMENT, nullable = true)
    private String totalChargeComment;

    @Column(name = COLUMN_FAILURE, nullable = true)
    private String failure;
    @Column(name = COLUMN_NOTES, nullable = true)
    private String notes;
    @Column(name = COLUMN_NAMA_PENGIRIM, nullable = true)
    private String namaPengirim;
    @Column(name = COLUMN_MERCHANT_CODE, nullable = false)
    private String merchantCode;
    @Column(name = COLUMN_MERCHANT_NAME, nullable = true)
    private String merchantName;
    
    
    @Column(name = COLUMN_NAMA_PENGIRIM_API, nullable = true)
    private String namaPengirimAPI;
    @Column(name = COLUMN_NAMA_PENGIRIM_SYSTEM, nullable = true)
    private String namaPengirimSystem;
    
    @Column(name = COLUMN_ALAMAT_PENGIRIM_API, nullable = true)
    private String alamatPengirimAPI;
    @Column(name = COLUMN_ALAMAT_PENGIRIM_SYSTEM, nullable = true)
    private String alamatPengirimSystem;
    
    @Column(name = COLUMN_KODE_ORIGIN_API, nullable = true)
    private String kodeOriginAPI;
    @Column(name = COLUMN_KODE_ORIGIN_SYSTEM, nullable = true)
    private String kodeOriginSystem;
    
    @Column(name = COLUMN_NAMA_PENERIMA_API, nullable = true)
    private String namaPenerimaAPI;
    @Column(name = COLUMN_NAMA_PENERIMA_SYSTEM, nullable = true)
    private String namaPenerimaSystem;
    
    @Column(name = COLUMN_ALAMAT_PENERIMA_API, nullable = true)
    private String alamatPenerimaAPI;
    @Column(name = COLUMN_ALAMAT_PENERIMA_SYSTEM, nullable = true)
    private String alamatPenerimaSystem;
    
    @Column(name = COLUMN_KODE_DESTINASI_API, nullable = true)
    private String kodeDestinasiAPI;
    @Column(name = COLUMN_KODE_DESTINASI_SYSTEM, nullable = true)
    private String kodeDestinasiSystem;
    
    @Column(name = COLUMN_FOCS_AMOUNT, nullable = true)
    private String focsAmount;
    @Column(name = COLUMN_FOCSA_AMOUNT, nullable = true)
    private String focsaAmount;
    @Column(name = COLUMN_SHIPPING_COST, nullable = true)
    private String shippingCost;
    @Column(name = COLUMN_SHIP_COST, nullable = true)
    private String shipCost;
    
    

    @Column(name = COLUMN_MONTH, nullable = false)
    private String month;
    @Column(name = COLUMN_YEAR, nullable = false)
    private String year;
    @Column(name = COLUMN_LOGISTIC_NAME, nullable = false)
    private String logisticName;


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
    
    public void assignAWB(Row row)
    {
        awbNumber=row.getCell(2).toString();
        kodeOriginSystem=row.getCell(3).toString();
        gdnRef=row.getCell(4).toString();
        kodeDestinasiSystem=row.getCell(5).toString();
        namaPenerimaSystem=row.getCell(6).toString();
        totalChargeSystem=new BigDecimal(row.getCell(9).getNumericCellValue());
    }

//    @Override
//    public String toString() {
//        return "AWB{" + "counter=" + counter + ", awbNumber=" + awbNumber + '}';
//    }
    

}
