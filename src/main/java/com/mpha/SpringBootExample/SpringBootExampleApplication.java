package com.mpha.SpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
		
		System.out.println("Service Started.");
	}
	
	@GetMapping("/simplerequest")
	public String simpleRequest() {
		// In this case, we return the plain text response "ok"
		return "ok";
	}

}
