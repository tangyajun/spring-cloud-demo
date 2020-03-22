package com.tangyajun.springcloud.consumer.web.service.remote;


import feign.hystrix.FallbackFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-01-07-18:38
 **/
@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserService> {
	private static final Logger LOGGER= LogManager.getLogger(UserServiceFallbackFactory.class);
	@Override
	public UserService create(Throwable throwable) {
		LOGGER.info(throwable.getMessage());
		return new UserService() {
			@Override
			public String sayHello(String username) {
				return "Fallback method invoke, name is "+username+",message is "+throwable.getMessage();
			}
		};
	}
}
