package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DartsApplication.class, args);
		SpringApplication.run(DartGame.class, args);
	}

}
