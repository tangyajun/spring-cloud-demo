package com.example.product.web.controller;

import com.example.product.web.command.UserInfoCommand;
import com.example.product.web.service.remote.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-01-08-19:13
 **/
@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	UserInfoService userInfoService;
	Logger logger= LoggerFactory.getLogger(UserController.class);
	//@Autowired
	//UserInfoCommand userInfoCommand;
	AtomicInteger count=new AtomicInteger();

	@GetMapping(value = "/hello")
	public Object hello(@RequestParam String username) {
		/*try {
			Thread.sleep(100000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		if (StringUtils.isEmpty(username)) {
			throw new RuntimeException("请求异常");
		}
		System.err.println(count.addAndGet(1));
		//logger.info("invoke 8082 server port, 8081 server is  available ");
		//return userInfoCommand.execute();
		return userInfoService.getUserInfo(username);
	}

	@RequestMapping(value = "/timeout")
	public String timeout() throws InterruptedException {
		logger.info("invoke timeout endpoint");
		Thread.sleep(10000L);
		return "success";
	}

	@RequestMapping(value = "/exception")
	public String exception() {
		logger.info("invoke exception endpoint");
		if (System.currentTimeMillis()%2==0) {
			throw new RuntimeException("random exception ");
		}
		return "success";
	}
}
