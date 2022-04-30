package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpresionSquareApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaExpresionSquareApplication.class, args);
		
		SquareDemo demo = (2,2) -> 2*2;
	}

}
