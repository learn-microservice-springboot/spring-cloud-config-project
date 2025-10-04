package com.foodapp.delivery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FoodappConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodappConfigServerApplication.class, args);
	}

}
