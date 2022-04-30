package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpresionStaticMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaExpresionStaticMethodApplication.class, args);
		
		System.out.println("Main method From Class");
		
		DemoStatic.main(args);
	}

}
