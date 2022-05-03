package com.lambda.comprator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService_lambda {

	public static List<Book> getBook(){
		
		List<Book> books = new BookDao().getBooks();
		Collections.sort(books, (o1,o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}
	public static void main(String[] args) {

		System.out.println(new BookService().getBook());
	}

}
