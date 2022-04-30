package com.example.demo;

import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpresionPredicateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaExpresionPredicateApplication.class, args);
		
		Predicate<Integer> predicate= (i)-> i%2==0;
		
		System.out.println("Check input is integer ::"+predicate.test(10));
		System.out.println("Check input is integer ::"+predicate.test(21));
	}

}
