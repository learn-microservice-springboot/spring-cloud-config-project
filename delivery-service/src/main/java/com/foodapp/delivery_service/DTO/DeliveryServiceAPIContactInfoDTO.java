package com.foodapp.delivery_service.DTO;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import lombok.Data;

@ConfigurationProperties(prefix = "delivery-service")
@Data
public class DeliveryServiceAPIContactInfoDTO {

	private String message;
	private ContactDetails contactDetails;

	@Data
	public static class ContactDetails
	{
		private String name;
		private String email;
		private List<String> onCallSupport;
	}
	
}
