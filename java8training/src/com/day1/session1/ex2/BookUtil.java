package com.day1.session1.ex2;

public class BookUtil {
					//T---> T/F
	static public boolean pricyBook(Book book) {
		return book.getPrice()>=700;
	}
	static public double getPrice(Book book) {
		return book.getPrice();
	}
}
