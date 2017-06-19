/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.BoliviaApplication;
import javafx.application.Application;
import com.gdn.scm.bolivia.entity.Process;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class ProcessService {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public Process requestProcess(Process process)
	{
		System.out.println("Reques process"+process);
		rabbitTemplate.convertAndSend(BoliviaApplication.queueName,process);
		return process;
	}
}