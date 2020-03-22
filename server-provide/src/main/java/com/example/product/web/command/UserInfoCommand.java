package com.example.product.web.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-01-17-9:52
 **/
@Component
public class UserInfoCommand extends HystrixCommand {

	@Autowired
	RestTemplate restTemplate;

	public UserInfoCommand(){
		super(HystrixCommandGroupKey.Factory.asKey("UserInfoCommand.getUser"));
	}

	@Override
	protected Object run() throws Exception {
		return restTemplate.getForEntity("http://localhost:8086/users/info?username=111",String.class);
	}

	@Override
	protected Object getFallback() {
		System.out.println(getFailedExecutionException().getMessage());
		return super.getFallback();
	}
}
