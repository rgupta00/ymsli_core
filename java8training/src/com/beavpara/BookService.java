package com.beavpara;
import java.util.*;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;
public class BookService {

	public static List<Book> getAllBooksOnCondition(List<Book> books,Predicate<Book>predicate){
		return books.stream().filter(predicate).collect(toList());
	}
	
}
