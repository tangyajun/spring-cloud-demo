package com.tangyajun.springcloud.server.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yang
 * @Description TO DO
 * @create 2019-04-28-19:17
 **/
@RestController
@RequestMapping(value = "")
public class HelloController {

	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String index() {
		List<String> serviceList= client.getServices();
		for (String service: serviceList) {
			System.out.println("service :"+service);
		}
		return "hello world";
	}
}
