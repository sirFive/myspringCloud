package com.xie.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudmemberApplication {

	//
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudmemberApplication.class, args);
	}
}
