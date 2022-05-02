package com.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {

		LocalDate date=LocalDate.now();
		
		System.out.println("LocalDate :: "+ date);
		
		LocalTime time = LocalTime.now();
		
		System.out.println("Time :: "+time);
	}

}
