package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpresionRunnableApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaExpresionRunnableApplication.class, args);
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				
				for(int i=0; i<10; i++) {
				System.out.println("Child Thread"+i);
			}
			}

		};
		Thread t = new Thread(runnable);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread "+ i);
		}
		
	}

}
