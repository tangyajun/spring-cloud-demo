package com.example.service.provide.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yang
 * @Description TO DO
 * @create 2020-04-06-7:43
 **/
@RestController
public class TestController {

	@GetMapping(value = "/add")
	public String add(Integer a, Integer b, HttpServletRequest request) {
		return "source port: "+request.getServerPort()+", Result: "+(a+b);
	}
}
