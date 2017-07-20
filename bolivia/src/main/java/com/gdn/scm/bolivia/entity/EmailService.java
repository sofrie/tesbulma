/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import org.springframework.mail.SimpleMailMessage;

/**
 *
 * @author sofri
 */
public interface EmailService {
    void sendSimpleMessage(String to,
                           String subject,
                           String text);
    void sendSimpleMessageUsingTemplate(String to,
                                        String subject,
                                        SimpleMailMessage template,
                                        String ...templateArgs);
    void sendMessageWithAttachment(String to,
                                   String subject,
                                   String text,
                                   String pathToAttachment);
}
