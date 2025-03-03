package com.atech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaServer
@EnableEurekaClient
@SpringBootApplication
public class AtechServerRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtechServerRegisterApplication.class, args);
	}

}
