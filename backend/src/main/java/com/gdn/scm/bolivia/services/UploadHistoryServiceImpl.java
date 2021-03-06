/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.repository.UploadHistoryRepository;
import com.gdn.scm.bolivia.request.UploadHistoryRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class UploadHistoryServiceImpl implements UploadHistoryService {

    @Autowired
    UploadHistoryRepository uploadHistoryRepository;

    @Override
    public void addUploadHistory(UploadHistoryRequest a) {
        UploadHistory upload = new UploadHistory();
        BeanUtils.copyProperties(a, upload);
        Integer count = 0;
        count = uploadHistoryRepository.findAll().size();
        Date today = new Date();
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
        String date = DATE_FORMAT.format(today);
        System.out.println("Today in dd-MM-yyyy format : " + date);

        upload.setId(count.toString());
        upload.setOk("-");
        upload.setProblemExist("-");
        upload.setJumlahTagihan("-");
        upload.setStatus("Uploaded");
        upload.setLast_modified(date);
        //UploadHistory tmp=new UploadHistory("3", "June", "2017", "300", "3", "Rp.xxxx.xxx", "A Logistic", "Uploaded", date.toString());
        uploadHistoryRepository.save(upload);
    }

    @Override
    public List<UploadHistory> getAll() {
        return uploadHistoryRepository.findAll();
    }

    @Override
    public List<UploadHistory> getByStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UploadHistory> getByYear(String year) {
        return uploadHistoryRepository.findByYear(year);
    }

    @Override
    public List<UploadHistory> getByLogisticName(String logisticName) {
        return uploadHistoryRepository.findByLogistic(logisticName);
    }

    @Override
    public List<UploadHistory> getByMonth(String month) {
        return uploadHistoryRepository.findByMonth(month);
    }

    @Override
    public List<UploadHistory> filterAll(String month, String year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUploadHistory(UploadHistory a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUploadHistory(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UploadHistory getById(String ID) {
        return uploadHistoryRepository.findOne(ID);
    }

    @Override
    public void addUploadHistory(UploadHistory a) {
        uploadHistoryRepository.save(a);
    }

}
