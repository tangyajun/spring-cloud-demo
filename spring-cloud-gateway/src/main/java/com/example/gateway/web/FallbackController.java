package com.example.gateway.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-02-15-16:34
 **/
@RestController
public class FallbackController {

	@GetMapping(value = "/fallback")
	public String fallback() {
		return "message from gateway,provide service is invaliable";
	}
}
