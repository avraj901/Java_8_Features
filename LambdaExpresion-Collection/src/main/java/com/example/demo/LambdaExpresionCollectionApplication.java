package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpresionCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaExpresionCollectionApplication.class, args);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(0);
		Comparator<Integer> c = (i1, i2) -> i1<i2?-1:i1>i2?1:0;
		Collections.sort(al, c);
		System.out.println("sorted Array List ::"+al);
		al.stream().forEach(System.out::println);
	}

}
