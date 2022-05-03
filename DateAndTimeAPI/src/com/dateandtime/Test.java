package com.dateandtime;

import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("dateTime ::"+dateTime);
		
		System.out.println("getDayOfMonth :: "+dateTime.getDayOfMonth());
		
		System.out.println("getDayOfYear ::"+dateTime.getYear());
		
		System.out.println("getMonthValue ::"+dateTime.getMonthValue());
		
		
	}

}
