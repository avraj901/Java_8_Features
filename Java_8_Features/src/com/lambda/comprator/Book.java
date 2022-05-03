package com.lambda.comprator;

public class Book {

	private int id;
	private String name;
	private String pages;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, String pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}
	
	
}
