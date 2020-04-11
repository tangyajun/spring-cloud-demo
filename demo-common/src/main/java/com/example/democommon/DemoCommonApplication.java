package com.example.democommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.**")
@SpringBootApplication
public class DemoCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCommonApplication.class, args);
	}

}
