package com.beavpara;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoEx {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book(121, "java", "raj", 240), new Book(191, "java adv", "raj", 890),
				new Book(181, "python", "ekta", 890), new Book(61, "python adv", "ekta", 940),
				new Book(621, "c programming", "gunika", 300));

		System.out.println("------------allJavaBooks--------------");
		List<Book> allJavaBooks = 
				BookService.getAllBooksOnCondition(books, book -> book.getTitle().contains("java"));
		
		allJavaBooks.forEach(b-> System.out.println(b));
		
		System.out.println("------------allCostlyBooks--------------");
		List<Book> allCostlyBooks = 
				BookService.getAllBooksOnCondition(books, book -> book.getPrice()>=700);
		
		allCostlyBooks.forEach(b-> System.out.println(b));
		
	}
}
