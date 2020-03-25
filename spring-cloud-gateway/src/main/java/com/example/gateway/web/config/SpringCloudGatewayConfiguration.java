package com.example.gateway.web.config;

import com.example.gateway.web.filter.CustomeGatewayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-03-22-20:55
 **/
//@Configuration
public class SpringCloudGatewayConfiguration {

	@Bean
	public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
		// @formatter:off
		return builder.routes()
				.route(r -> r.path("/test/**")
						.filters(f -> f.filter(new CustomeGatewayFilter())
								.addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
						.uri("lb://hello-consumer")
						.order(0)
						.id("customer_filter_router")
				)
				.build();
		// @formatter:on
	}
}
