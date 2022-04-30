package com.example.demo;

import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpresionPredicateWithStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaExpresionPredicateWithStringApplication.class, args);
		
		String[] s= {"avanish","Ramu","Ankur","AnyName"};
		
		Predicate<String> s2= s3->s3.length()>5;
		
		Predicate<String> s4= s3->s3.length()%2==0;
		
		for(String s3 : s) {
		System.out.println("Length is greater than 5 ::"+s2.test(s3));
		
		System.out.println("String is even ::"+s4.test(s3));
	}
	}

}
