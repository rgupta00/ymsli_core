package com.day1.session1.ex2;
import java.util.*;
import java.util.function.Predicate;
public class BookService {
	
	public static List<Book>getBooksOnPredicate(List<Book> books, Predicate<Book> predicate){
		List<Book> selectedBooks=new ArrayList<>();
		for(Book book: books) {
			if(predicate.test(book))
				selectedBooks.add(book);
		}
		return selectedBooks;
	}
	
}
