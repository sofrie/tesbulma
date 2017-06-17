package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proccess")
public class ProcessController {
	@Autowired
	ProcessService processService;
	
	@RequestMapping(method= RequestMethod.POST)
	public Process process(@RequestBody Process process)
	{
		return processService.requestProcess(process);
	}
}
