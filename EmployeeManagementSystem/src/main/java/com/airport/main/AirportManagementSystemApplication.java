package com.airport.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class AirportManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportManagementSystemApplication.class, args);
	}

}
