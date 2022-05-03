package com.date;

import java.time.Year;
import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		Year y = Year.of(n);
		
		if(y.isLeap()) {
			System.out.printf("%d is leap Year", n);
		}
		else {
			System.out.printf("%d is not a leap year ", n );
		}
	}
}
