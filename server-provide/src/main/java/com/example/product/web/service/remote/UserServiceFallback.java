package com.example.product.web.service.remote;

import org.springframework.stereotype.Component;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-01-09-16:17
 **/
@Component
public class UserServiceFallback implements UserInfoService {
	@Override
	public String getUserInfo(String username) {
		return "hello "+username+",cloud-service-provide is unavalable,this is fallback method";
	}
}
