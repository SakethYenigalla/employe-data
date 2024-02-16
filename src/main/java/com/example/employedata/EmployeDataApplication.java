package com.example.employedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class EmployeDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeDataApplication.class, args);
	}

}
