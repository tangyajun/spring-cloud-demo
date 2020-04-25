package com.example.gateway;

import com.example.gateway.web.filter.CustomeGatewayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tangyajun
 */
@ComponentScan(value = {"com.example"})
@SpringBootApplication
public class SpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayApplication.class, args);
	}


	/*@Bean
	public RouteLocator customerRouteLocator (RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r->r.path("/test")
				.filters(f->f.filter(new CustomeGatewayFilter()))
		.uri("http://localhost:8001/customerFilter?name=xujin")
		.order(0)
		.id("customer_filter")).build();
	}*/
}
