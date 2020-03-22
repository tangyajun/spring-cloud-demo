package com.example.product.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-01-17-9:59
 **/
@Configuration
public class ServerProvideConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
