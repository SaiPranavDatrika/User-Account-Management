package com.appswebmobileapps.ui;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration

@ComponentScan

@SpringBootApplication
public class MobileappwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileappwebApplication.class, args);
		
	}

}
