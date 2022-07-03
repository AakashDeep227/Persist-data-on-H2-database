package com.onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.onlinestore.enitity")
public class OnlineStoreCaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineStoreCaseStudyApplication.class, args);
	}

}
