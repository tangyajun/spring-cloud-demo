package com.tangyajun.springcloud.consumer.web.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-01-08-14:42
 **/
@FeignClient(name = "server-provide",fallbackFactory = UserServiceFallbackFactory.class)
public interface UserService {
	@GetMapping(value = "/users/hello")
	String sayHello(@RequestParam(value = "username") String username);
}
