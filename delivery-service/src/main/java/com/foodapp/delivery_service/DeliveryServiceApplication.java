package com.foodapp.delivery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.foodapp.delivery_service.DTO.DeliveryServiceAPIContactInfoDTO;

@SpringBootApplication
@EnableConfigurationProperties(value = DeliveryServiceAPIContactInfoDTO.class)
public class DeliveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryServiceApplication.class, args);
	}

}
