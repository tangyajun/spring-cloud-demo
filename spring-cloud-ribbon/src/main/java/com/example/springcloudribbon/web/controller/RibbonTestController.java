package com.example.springcloudribbon.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-04-05-18:55
 **/
@RestController
public class RibbonTestController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/add")
	public String add(Integer a,Integer b) {
		String result=restTemplate.getForObject("http://RIBBON-SERVICE-PROVIDER/add?a="+a+"&b="+b,String.class);
		System.out.println(result);
		return result;
	}
}
