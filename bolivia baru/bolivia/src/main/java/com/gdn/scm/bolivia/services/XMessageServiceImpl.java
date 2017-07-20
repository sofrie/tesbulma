/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.x.message.mq.model.MessageEmailRequest;
import com.gdn.x.message.service.client.MessageTemplateDeliveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class XMessageServiceImpl implements XMessageService {

  private static final Logger LOG = LoggerFactory.getLogger(XMessageServiceImpl.class);

  @Autowired
  private MessageTemplateDeliveryClient messageTemplateDeliveryClient;

  /*
   * (non-Javadoc)
   * @see
   * com.gdn.x.logistic.integration.outbound.api.XMessageService#sendMessageToQueue(com.gdn.x.message
   * .mq.model.MessageEmailRequest)
   */
  @Override
  public void sendMessageToQueue(MessageEmailRequest request) {
    messageTemplateDeliveryClient.sendMessageToQueue(request);
  }

}
