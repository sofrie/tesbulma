/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import com.gdn.scm.bolivia.BoliviaApplication;
import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.repository.AWBRepository;
import com.gdn.scm.bolivia.repository.UploadHistoryRepository;
import com.gdn.scm.bolivia.services.AWBService;
import com.gdn.scm.bolivia.services.ProcessService;
import com.gdn.scm.bolivia.services.UploadHistoryService;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static org.bouncycastle.crypto.tls.ConnectionEnd.client;
import org.redisson.Redisson;
import org.redisson.api.RList;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class Compare {

    @Autowired
    AWBRepository awbRepository;

    @Autowired
    ProcessService processService;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    UploadHistoryService uploadHistoryService;

    public Integer counter = -1;

    RedissonClient redisson = Redisson.create();
    public RMap<String, String> map = redisson.getMap("myMap");
    //public RList<RList<String>> list = redisson.getList("myList");

    public Compare() {
        counter = 0;
//        try {     
//            // get input excel files
//            FileInputStream excellFile1 = new FileInputStream(new File(
//                    "D:\\EXCEL\\Book1.xlsx"));
//            FileInputStream excellFile2 = new FileInputStream(new File(
//                    "D:\\EXCEL\\Book2.xlsx"));
//
//            // Create Workbook instance holding reference to .xlsx file
//            XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile1);
//            XSSFWorkbook workbook2 = new XSSFWorkbook(excellFile2);
//
//            // Get first/desired sheet from the workbook
//            XSSFSheet sheet1 = workbook1.getSheetAt(0);
//            XSSFSheet sheet2 = workbook2.getSheetAt(0);
//
//            // Compare sheets
//            if(compareTwoSheets(sheet1, sheet2)) {
//                System.out.println("\n\nThe two excel sheets are Equal");
//            } else {
//                System.out.println("\n\nThe two excel sheets are Not Equal");
//            }
//            
//            //close files
//            excellFile1.close();
//            excellFile2.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public void Send(XSSFSheet sheet1, Integer id) {
//        int firstRow1 = sheet1.getFirstRowNum();
//        int lastRow1 = sheet1.getLastRowNum();

        AWB awb = new AWB();
        Iterator<Row> itr = sheet1.iterator();
        while (itr.hasNext()) {
            Row row = itr.next();
            if (row.getRowNum() > 1) {

                awb.assignAWB(row);

                awb.setMonth("December");
                awb.setYear("2017");
                awb.setLogisticName("D Logistic");
                awb.setReconStatus("OK");
                awb.setMerchantCode("MERCH-CODE-007");
                Process p = new Process();
                counter++;
                awb.setCounter(counter);
                awb.setUploadHistoryNumber(id.toString());
                map.put(awb.getAwbNumber(), awb.getUploadHistoryNumber());

//                map.remove(awb.getAwbNumber(), awb.getUploadHistoryNumber().toString());
//                map.containsKey(awb.getUploadHistoryNumber().toString());
//                p.setProccessId(awb.getAwbNumber());
//                p.setRequestId(id.toString());
//                p.setCounter(counter);
//                for (Map.Entry<String, String> entry : map.entrySet()) {
//                    System.out.println("ooooooooooooooooo"+" "+entry.getKey());
//                }
                processService.requestProcess(awb);
                // System.out.println(map);
            }
        }

//        for (int i = 2; i <= 10; i++) {
//            AWB awb = new AWB();
//            awb.setMonth("December");
//            awb.setYear("2017");
//            awb.setLogisticName("D Logistic");
//            awb.setGdnRef("GDN-REF-010");
//            awb.setReconStatus("OK");
//            awb.setMerchantCode("MERCH-CODE-007");
//            awb.setAwbNumber("AWB NUMBER");
//            int firstCell1 = sheet1.getRow(i).getFirstCellNum();
//            int lastCell1 = sheet1.getRow(i).getLastCellNum();
//
//            for (int j = 2; j <= 15; j++) {
//                if (sheet1.getRow(0).getCell(j).getRichStringCellValue().toString().equals("AWB NUMBER")) {
//                    awb.setAwbNumber(sheet1.getRow(i).getCell(j).getRichStringCellValue().toString());
//                }
////                System.out.println("----------------------------------");
////                System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue());
////                try
////                {
////                    System.out.println(sheet1.getRow(i).getCell(j).getRichStringCellValue().toString());
////                }
////                catch (Exception e)
////                {
////                    System.out.println(sheet1.getRow(i).getCell(j).getNumericCellValue());
////                }
//
//            }
//            Process p=new Process();
//            p.setProccessId(awb.getAwbNumber());
//            p.setRequestId(awb.getAwbNumber());
//            processService.requestProcess(p);
        // }
    }

    public AWB requestProcess(AWB awb) {
        System.out.println("Reques process" + awb);
        rabbitTemplate.convertAndSend(BoliviaApplication.queueName, awb);
        return awb;
    }

    public static boolean compareTwoSheets(XSSFSheet sheet1, XSSFSheet sheet2) {
        int firstRow1 = sheet1.getFirstRowNum();
        int lastRow1 = sheet1.getLastRowNum();
        boolean equalSheets = true;
        for (int i = firstRow1; i <= lastRow1; i++) {

            System.out.println("\n\nComparing Row " + i);

            XSSFRow row1 = sheet1.getRow(i);
            System.out.println("----------------------------------");
            System.out.println(sheet1.getRow(i).getCell(i).getRichStringCellValue());
            XSSFRow row2 = sheet2.getRow(i);
            if (!compareTwoRows(row1, row2)) {
                equalSheets = false;
                System.out.println("Row " + i + " - Not Equal");
                break;
            } else {
                System.out.println("Row " + i + " - Equal");
            }
        }
        return equalSheets;
    }

    // Compare Two Rows
    public static boolean compareTwoRows(XSSFRow row1, XSSFRow row2) {
        if ((row1 == null) && (row2 == null)) {
            return true;
        } else if ((row1 == null) || (row2 == null)) {
            return false;
        }

        int firstCell1 = row1.getFirstCellNum();
        int lastCell1 = row1.getLastCellNum();
        boolean equalRows = true;

        // Compare all cells in a row
        for (int i = firstCell1; i <= lastCell1; i++) {
            XSSFCell cell1 = row1.getCell(i);
            XSSFCell cell2 = row2.getCell(i);
            if (!compareTwoCells(cell1, cell2)) {
                equalRows = false;
                System.err.println("       Cell " + i + " - NOt Equal");
                break;
            } else {
                System.out.println("       Cell " + i + " - Equal");
            }
        }
        return equalRows;
    }

    // Compare Two Cells
    public static boolean compareTwoCells(XSSFCell cell1, XSSFCell cell2) {
        if ((cell1 == null) && (cell2 == null)) {
            return true;
        } else if ((cell1 == null) || (cell2 == null)) {
            return false;
        }

        boolean equalCells = false;
        int type1 = cell1.getCellType();
        int type2 = cell2.getCellType();
        if (type1 == type2) {
            if (cell1.getCellStyle().equals(cell2.getCellStyle())) {
                // Compare cells based on its type
                switch (cell1.getCellType()) {
                    case HSSFCell.CELL_TYPE_FORMULA:
                        if (cell1.getCellFormula().equals(cell2.getCellFormula())) {
                            equalCells = true;
                        }
                        break;
                    case HSSFCell.CELL_TYPE_NUMERIC:
                        if (cell1.getNumericCellValue() == cell2
                                .getNumericCellValue()) {
                            equalCells = true;
                        }
                        break;
                    case HSSFCell.CELL_TYPE_STRING:
                        if (cell1.getStringCellValue().equals(cell2
                                .getStringCellValue())) {
                            equalCells = true;
                        }
                        break;
                    case HSSFCell.CELL_TYPE_BLANK:
                        if (cell2.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
                            equalCells = true;
                        }
                        break;
                    case HSSFCell.CELL_TYPE_BOOLEAN:
                        if (cell1.getBooleanCellValue() == cell2
                                .getBooleanCellValue()) {
                            equalCells = true;
                        }
                        break;
                    case HSSFCell.CELL_TYPE_ERROR:
                        if (cell1.getErrorCellValue() == cell2.getErrorCellValue()) {
                            equalCells = true;
                        }
                        break;
                    default:
                        if (cell1.getStringCellValue().equals(
                                cell2.getStringCellValue())) {
                            equalCells = true;
                        }
                        break;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return equalCells;
    }

}
