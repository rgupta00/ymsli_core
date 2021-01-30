package com.day11.java8stuff;

import java.util.Arrays;
import java.util.*;

public class LambdaExVsAnnInnerClass {

	public static void main(String[] args) {
		List<Book> books = getAllBooks();

		// print all books sorted as per price

		// is ann inner class is 100% replacable by lambda : No
		// 99% of case u can do it

		// how it works : it is using a concept
		// "invokeDynamic 1.7" it is impl as static method , store in MA

		// ann inner: aka object: ann class
		Comparator<Book> cmp = new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return Double.compare(o2.getPrice(), o1.getPrice());
			}
		};

		// c/c++: funcation pointer
		/*
		 * var f=function(){ }
		 * 
		 * funcation foo(f){ return f; }
		 * 
		 * If a funcation is passed during callng another fun or a function returna a
		 * funcation then that fun is called higher order funcation
		 * 
		 */

		// lambda: aka peice of code : ann method
		// Method ref*: aka function pointer 	::

		Comparator<Book> cmpV2 = (Book o1, Book o2) -> {
			return Double.compare(o2.getPrice(), o1.getPrice());

		};
		//type inference?
		Comparator<Book> cmpV3 = (o1, o2) -> {
			return Double.compare(o2.getPrice(), o1.getPrice());

		};

	//	()->{}
		Comparator<Book> cmpV4 = (o1, o2) ->  Double.compare(o2.getPrice(), o1.getPrice());

		

		Collections.sort(books, cmpV4);

		System.out.println("books as per price");

		for (Book book : books) {
			System.out.println(book);
		}

	}

	private static List<Book> getAllBooks() {
		List<Book> books = Arrays.asList(new Book(121, "java", "raj", 400, 778),
				new Book(1, "phython", "raj", 350, 478), new Book(61, "C++", "gunika", 500, 490),
				new Book(16, "OS", "raj", 400, 300), new Book(121, "Linux", "amit", 600, 408)

		);
		return books;
	}
}
