package com.lambda.comprator;

import java.util.Comparator;

public class MyComparator implements Comparator<Book>{

	@Override
	public int compare(Book arg0, Book arg1) {
		return arg0.getName().compareToIgnoreCase(arg1.getName());
	}

}
