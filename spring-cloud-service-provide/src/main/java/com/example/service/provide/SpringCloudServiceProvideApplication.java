package com.example.service.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tangyajun
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@ComponentScan(value = {"com.example"})
public class SpringCloudServiceProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceProvideApplication.class, args);
	}

}
