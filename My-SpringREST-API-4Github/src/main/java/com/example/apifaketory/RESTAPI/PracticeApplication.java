package com.example.apifaketory.RESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}
	
//	defining a RestTemplate bean to make it available to the application context
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
