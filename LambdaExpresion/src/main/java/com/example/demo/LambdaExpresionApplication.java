package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpresionApplication {

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(LambdaExpresionApplication.class, args);
		
		System.out.println("Hiii....");
		LambdaExpressoinn lambdaExpressoinn = new LambdaExpressoinn();
		lambdaExpressoinn.m1();
	}

}
