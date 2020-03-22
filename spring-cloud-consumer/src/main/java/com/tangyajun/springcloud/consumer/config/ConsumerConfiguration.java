package com.tangyajun.springcloud.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yang
 * @Description TO DO
 * @create 2019-04-29-11:11
 **/
@Configuration
public class ConsumerConfiguration {

	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
