/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.x.message.mq.model.MessageEmailRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static org.hibernate.jpa.internal.EntityManagerImpl.LOG;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailParseException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class SimpleOrderManager {

    private String registerAirwayBillCcJNE;

    private String registerAirwayBillSendMailTo;

    Logger logger = LoggerFactory.getLogger(this.getClass());
    JavaMailSender mailSender;
    SimpleMailMessage simpleMailMessage;

//     private MailSender mailSender;  
    @Autowired
    public XMessageService xMessageService;

    private String FILE_NAME = "D:/Data/AWB.xlsx";

    public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
        this.simpleMailMessage = simpleMailMessage;
    }

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String dear, String content) {

        MimeMessage message = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom(simpleMailMessage.getFrom());
            helper.setTo(simpleMailMessage.getTo());
            helper.setSubject(simpleMailMessage.getSubject());
            helper.setText(String.format(
                    simpleMailMessage.getText(), dear, content));

            FileSystemResource file = new FileSystemResource("C:\\log.txt");

            helper.addAttachment(file.getFilename(), file);

        } catch (MessagingException e) {
            throw new MailParseException(e);
        }

        logger.info("Sending...");

        mailSender.send(message);
        logger.info("Done!");

    }

    public void sendMail(String from, String to, String subject, String msg) throws FileNotFoundException {
        //creating message  
        MimeMessage message = mailSender.createMimeMessage();
        try {
            FileSystemResource excelFile = new FileSystemResource(new File(FILE_NAME));

            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            SimpleMailMessage pesan = new SimpleMailMessage();
            pesan.setFrom(from);
            pesan.setTo(to);
            pesan.setSubject(subject);
            pesan.setText(msg);

            helper.setFrom(simpleMailMessage.getFrom());
            helper.setTo(simpleMailMessage.getTo());
            helper.setSubject(simpleMailMessage.getSubject());
            helper.setText(String.format(
                    simpleMailMessage.getText(), "Kepada Yth. Sofrie", "hahaha"));

//            FileSystemResource file = new FileSystemResource("D:\\tes.txt");
//            
//            try
//            {helper.addAttachment(file.getFilename(), file);
//            }
//            
//            catch (Exception e){
//                e.printStackTrace();
//            }
        } catch (MessagingException e) {
            throw new MailParseException(e);
        }
        mailSender.send(message);

//        SimpleMailMessage message = new SimpleMailMessage();  
//        message.setFrom(from);  
//        message.setTo(to);  
//        message.setSubject(subject);  
//        
//        message.setText(msg);  
        //sending message  
//        mailSender.send(message);     
    }

    public void sendMailPickuptoXMessage(String ID, String attachmentFilename, String cc,
            String dateTimeStr) {

        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Map<String, Object> variables = new HashMap<String, Object>();

            variables.put("dateTime", dateTimeStr);

//            Map<String, String> attachmentLogistic = new HashMap<String, String>();
//            attachmentLogistic.put(attachmentFilename, FILE_NAME);
            MessageEmailRequest emailRequest = new MessageEmailRequest();
            //
            emailRequest.setMessageId("BLVRECONCILE");
            //
            emailRequest.setMessageTo("sofrie.zumaytis@gdn-commerce.com");
            emailRequest.setMessageFrom("no-reply@blibli.com");
            emailRequest.setMessageCc(cc);
            LOG.debug("cc email request : " + cc);
            //
            emailRequest.setMessageIdentifierKey(ID + dateTimeStr);
            emailRequest.setVariables(variables);
            emailRequest.setMessageSubject("Reconcile");

            LOG.debug("email request : " + emailRequest.toString());
//            try {
//                emailRequest.setAttachments(attachmentLogistic);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

            LOG.info("sending email to client");
            LOG.info("from...... " + emailRequest.getMessageFrom());
            LOG.info("id...... " + emailRequest.getMessageId());
            LOG.info(emailRequest);
            try {
                xMessageService.sendMessageToQueue(emailRequest);
            } catch (Exception e) {
                e.printStackTrace();
            }
            LOG.info("sending email done " + emailRequest.getMessageIdentifierKey());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    private void sendMailDropshiptoXMessage(String ID, Map<String, String> attachment, String attachmentFilename,
//            String cc, String dateTimeStr) {
//
//        Map<String, Object> variables = new HashMap<String, Object>();
//        variables.put("dateTime", dateTimeStr);
//
//        Map<String, String> attachmentLogistic = new HashMap<String, String>();
//        attachmentLogistic.put(attachmentFilename, attachment.get(attachmentFilename));
//
//        MessageEmailRequest emailRequest = new MessageEmailRequest();
//        //
//        emailRequest.setMessageId("XLOGAWBDROPR");
//        //
//        emailRequest.setMessageTo(registerAirwayBillSendMailTo);
//        emailRequest.setMessageCc(cc);
//        LOG.debug("cc email request : " + cc);
//        //
//        emailRequest.setMessageIdentifierKey(ID + dateTimeStr);
//        emailRequest.setVariables(variables);
//        LOG.debug("email request : " + emailRequest.toString());
//        emailRequest.setAttachments(attachmentLogistic);
//
//        LOG.info("sending email to client");
//        xMessageService.sendMessageToQueue(emailRequest);
//        LOG.info("sending email done " + emailRequest.getMessageIdentifierKey());
//
//        return;
//    }
}
