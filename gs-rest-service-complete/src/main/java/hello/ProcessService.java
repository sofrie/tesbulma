package hello;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessService {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public Process requestProcess(Process process)
	{
		System.out.println("Reques process"+process);
		rabbitTemplate.convertAndSend(Application.queueName,process);
		return process;
	}
}
