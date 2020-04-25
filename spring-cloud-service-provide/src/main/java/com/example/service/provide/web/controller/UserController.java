package com.example.service.provide.web.controller;

import com.example.democommon.bean.Response;
import com.example.democommon.exception.BusinessException;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-01-08-19:11
 **/
@RestController
@RequestMapping(value = "/users")
public class UserController {

	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping(value = "/info")
	public Response getUserInfo(@RequestParam String username) {
		int a=1/0;
		return Response.success(1,"","hello "+username+",欢迎访问,我是spring-cloud-service-provide");
	}

	public Response fallback(Throwable throwable) throws Exception {
		if (throwable != null) {
			throw new BusinessException(throwable,"cloud-service-provide");
		}
		return Response.fail(-1,"11111111111");
	}
}
