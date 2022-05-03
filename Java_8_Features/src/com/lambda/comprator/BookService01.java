package com.lambda.comprator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService01 {

	public static List<Book> getBook(){
		
		List<Book> books = new BookDao().getBooks();
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book arg0, Book arg1) {
				
				return arg0.getName().compareTo(arg1.getName());
			}
			
		});
		return books;
	}
	public static void main(String[] args) {

		System.out.println(new BookService().getBook());
	}

}
