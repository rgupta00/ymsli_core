package com.day1.session1.ex2;

public class BookSelectedData {
	
	private String title;
	private double price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public BookSelectedData(String title, double price) {
		this.title = title;
		this.price = price;
	}
	public BookSelectedData() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookSelectedData [title=");
		builder.append(title);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
