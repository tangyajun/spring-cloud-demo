package com.tangyajun.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringCloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerApplication.class, args);
	}

}
