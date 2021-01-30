package com.day11.java8stuff;

class Book {
	private int id;
	private String name;
	private String author;
	private double price;
	private int noOfPages;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public Book(int id, String name, String author, double price, int noOfPages) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.noOfPages = noOfPages;
	}
	public Book() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", author=");
		builder.append(author);
		builder.append(", price=");
		builder.append(price);
		builder.append(", noOfPages=");
		builder.append(noOfPages);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
