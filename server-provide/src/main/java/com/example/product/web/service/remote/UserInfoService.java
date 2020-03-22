package com.example.product.web.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-01-09-16:14
 **/
@FeignClient(name = "cloud-service-provide",fallback = UserServiceFallback.class)
public interface UserInfoService {
	@GetMapping(value = "/users/info")
	String getUserInfo(@RequestParam(value = "username") String username);
}
