package com.cg.sm;

import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class B84StudentModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(B84StudentModuleApplication.class, args);
	}
		
		@Bean
		public RestTemplate restTemplate() {
			return new RestTemplate();
	}

}
