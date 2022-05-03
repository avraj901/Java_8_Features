package com.lambda;

public class LambdaDemo {

	public static void main(String[] args) {

		CalculatorDemo demo = () -> {
			System.out.println("Show class functional interface method");
			return false;
		};
		
		System.out.println(demo.show());
		
	}

}
