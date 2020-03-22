package com.tangyajun.springcloud.consumer.web.service.remote;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yang
 * @Description TO DO
 * @create 2019-05-07-6:34
 **/
//@Service
//@FeignClient(name = "")
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	//@HystrixCommand(fallbackMethod = "helloFallback")
	public String helloService() {
		return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
	}


	public String helloFallback() {
		return "error";
	}
}
