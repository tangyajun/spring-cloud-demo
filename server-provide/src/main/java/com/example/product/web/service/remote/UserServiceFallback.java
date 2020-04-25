package com.example.product.web.service.remote;



import com.example.democommon.bean.Response;

import org.springframework.stereotype.Component;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-01-09-16:17
 **/
@Component
public class UserServiceFallback implements UserInfoService {
	@Override
	public Response getUserInfo(String username) {
		return Response.fail(-1,"hello "+username+",cloud-service-provide is unavalable,this is fallback method");
	}
}
