package com.premit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSbStandAloneAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSbStandAloneAppApplication.class, args);
		System.out.println("Welcome to PREMIT.");
	}

}
