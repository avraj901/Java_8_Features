package com.dateandtime.period;

import java.time.LocalDate;
import java.time.Period;

public class Test {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1994, 8, 03);
		
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(date, today);
		
		System.out.printf("Your age is %d Years %d months %d days", period.getYears(), period.getMonths(), period.getDays());
	}
}
