package com.tekarch.TAFUserServiceMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tekarch.TAFUserServiceMS")
public class TafUserServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TafUserServiceMsApplication.class, args);
	}

}
