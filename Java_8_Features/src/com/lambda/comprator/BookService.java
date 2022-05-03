package com.lambda.comprator;

import java.util.Collections;
import java.util.List;

public class BookService {

	
	public static List<Book> getBook(){
		
		List<Book> books = new BookDao().getBooks();
		Collections.sort(books, new MyComparator());
		return books;
	}
	public static void main(String[] args) {

		System.out.println(new BookService().getBook());
	}

}
