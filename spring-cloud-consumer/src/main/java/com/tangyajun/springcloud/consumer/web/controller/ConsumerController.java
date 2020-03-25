package com.tangyajun.springcloud.consumer.web.controller;



import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tangyajun.springcloud.consumer.web.service.remote.HelloService;
import com.tangyajun.springcloud.consumer.web.service.remote.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-04-29-11:08
 **/
@RestController
@RequestMapping(value = "")
public class ConsumerController {
	@Autowired
	RestTemplate restTemplate;
	//@Autowired
	//HelloService helloService;
	@Autowired
	UserService userService;

	@HystrixCommand(fallbackMethod = "test")
	@GetMapping(value = "/hello")
	public String hello() {
		/*String body="";
		try {
			ResponseEntity<String> responseEntity=restTemplate.getForEntity(new URI("http://hello-service:8888/hello"),String.class);
			body=responseEntity.getBody();
			helloService.helloService();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return body;*/
		//return helloService.helloService();
		return userService.sayHello("test");

		//return JSON.toJSONString(Response.success(0,"success","hi,aaron"));
		//return "hi , aaron ";
	}


	public String test() {

		return "访问的用户过多请稍后再试";
//		return "访问的用户过多请稍后再试";
	}


}
