package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CjcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CjcApplication.class, args);
		System.out.println("CJC server");
	}

}
