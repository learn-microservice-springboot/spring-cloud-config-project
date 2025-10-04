package com.foodapp.delivery_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.delivery_service.DTO.DeliveryServiceAPIContactInfoDTO;

@RestController
@RequestMapping("/delivery")
@RefreshScope
public class DeliveryController {

	@Value("${build.version}")
	String version;

	@Autowired
	Environment environment;
	
	@Autowired
	DeliveryServiceAPIContactInfoDTO apiContactInfo;
	
	@GetMapping("/version")
	public ResponseEntity<String> getVersion() {
		return ResponseEntity.ok(version);
	}

	@GetMapping("/java-home")
	public ResponseEntity<String> getJavaHomePath() {
		return ResponseEntity.ok(environment.getProperty("JAVA_HOME"));
	}
	
	@GetMapping("/api-contact-info")
	public ResponseEntity<String> getAPIContactInfo() {
		return ResponseEntity.ok(apiContactInfo.toString());
	}
}
