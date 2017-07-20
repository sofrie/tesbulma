/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.x.message.mq.model.MessageEmailRequest;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author sofrie.zumaytis
 */

public interface XMessageService {

  void sendMessageToQueue(MessageEmailRequest request);

}
