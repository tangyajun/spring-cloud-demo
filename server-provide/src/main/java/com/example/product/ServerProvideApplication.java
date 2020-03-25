package com.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author tangyajun
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ServerProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerProvideApplication.class, args);
	}

}
