package com.day1.session1.ex2;
import java.util.*;
import java.util.List;import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DemoLambdaExpession2 {
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("foo","bar","jar","car");
		//s-> void
		names.stream().forEach( s-> System.out.println(s));
		
		names.stream().forEach(System.out::println);
		
		
		/*
		 * FI: sam
		 * Predicate		T-->T/F
		 * Function			A===>B
		 * Consumer			take something dont retrun anything: sop
		 * Supplier			taking nothing but return something
		 * 
		 */
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 240),
				new Book(191, "java adv", "raj", 890),
				new Book(181, "python", "ekta", 890),
				new Book(61, "python adv", "ekta", 940),
				new Book(621, "c programming", "gunika", 300));
		
		//classical loop, enhance for loop 1.5
		//Iteration dp
		//forEach: declerative programming: internal itartion vs ex iteration
		
		//books.stream().parallel().forEach( b-> System.out.println(b));
		
		
		
		
		//Collections.sort(books,( o1,  o2)->  Double.compare(o2.getPrice(), o1.getPrice()));
		
		//get the name of  list of all costly book 700, sorted by price
		
		
		//b->  b.getPrice()>=700
		//Book::pricyBook (method ref)
		
		Predicate<Book>predicate=Book::pricyBook;
		Predicate<Book>predicate2=b->  b.getPrice()>=700;
		
		Comparator<Book>comparator=( o1,  o2)->  Double.compare(o2.getPrice(), o1.getPrice());
		
		Function<Book, Double>fun=book-> book.getPrice();
		
		
		List<String>books2=books.stream()
				.filter( BookUtil::pricyBook)
				.sorted(Comparator.comparing(BookUtil::getPrice))
				.map( Book::getTitle)
				.collect(Collectors.toList());
		
		
		
//		
//		/*
//		 * Stream data processing is not a syntex suger ...
//it actually improved the performace
//=> loop fusion
//=> short circuting
//=> lazy evaluation
//=> internal iteation
//		 */
//		
//		//i want to get title of all books with price more then or equal 700 sorted as per price
//		
//		List<String> titles = books.stream()
//				.filter(book-> {
//					System.out.println("filter is called for book");
//					return book.getPrice()>=700;
//				})
//				.map(book->{
//					System.out.println("map is called book -> String");
//					return book.getTitle();
//				})
//				.skip(1)
//				.limit(2)
//				.collect(Collectors.toList());
//		
//		System.out.println("---------------");
//		
//		
//		List<Integer> list=Arrays.asList(2,5,6,6,8,8);
//		
//		list.stream().parallel().forEach(n-> System.out.println(n));
	//	Comparator<Book>c=( o1,  o2)->Double.compare(o2.getPrice(), o1.getPrice());
			
	/*
	 * 	python
		java adv
		python adv
		
		java adv
		python
		python adv
		
		python adv
		java adv
		python
	 */
		
//		List<String> titles=books.stream()
//				.filter(b-> b.getPrice()>=700)
//				.sorted(Comparator.comparing(Book::getPrice)
//						.thenComparing(Comparator.comparing(Book::getId)).reversed())
//				.map(b->b.getTitle())
//				.collect(Collectors.toList());
//		
//		titles.forEach(System.out::println);
//	
//		System.out.println("-------------");
//		
//		//We want to get only title 
//	
//		Function<Book, BookSelectedData> fun= book->  new BookSelectedData(book.getTitle(), book.getPrice());
//		
//		
//		
//		
//		List<BookSelectedData> titles2=books.stream()
//				.map(book->  new BookSelectedData(book.getTitle(), book.getPrice()))
//				.collect(Collectors.toList());
//		
//		titles2.forEach(data-> System.out.println(data));
//		
	}
}







