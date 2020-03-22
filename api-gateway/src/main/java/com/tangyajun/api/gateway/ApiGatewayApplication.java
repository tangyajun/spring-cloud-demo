package com.tangyajun.api.gateway;

import com.tangyajun.api.gateway.web.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayApplication {

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
