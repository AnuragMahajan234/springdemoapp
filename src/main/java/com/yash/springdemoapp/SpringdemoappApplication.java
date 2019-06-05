package com.yash.springdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoappApplication extends SpringBootServletInitializer{

	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(SpringdemoappApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringdemoappApplication.class, args);
	}

}

