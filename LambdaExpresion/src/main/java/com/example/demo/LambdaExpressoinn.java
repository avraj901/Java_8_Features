package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class LambdaExpressoinn {

	public static void m1() {

		DemoInterface var = (a, b) -> a * b;
		System.out.println("Square of 3 ::" + var.square(3, 3));

	}
}
