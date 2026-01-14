package com.serv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Serv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Serv2Application.class, args);
	}

}
