package com.tangyajun.springcloud.consumer.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * @Description TO DO
 * @create 2020-03-25-13:00
 **/
@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping(value = "/hello")
	public String sayHello(@RequestParam String username) {

		return "hello , "+username;
	}
}
