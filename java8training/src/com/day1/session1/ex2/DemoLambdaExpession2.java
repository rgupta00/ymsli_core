package com.day1.session1.ex2;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoLambdaExpession2 {

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 240),
				new Book(191, "java adv", "raj", 890),
				new Book(181, "python", "ekta", 890),
				new Book(61, "python adv", "ekta", 940),
				new Book(621, "c programming", "gunika", 300));
		
		/*
		 * Stream data processing is not a syntex suger ...
it actually improved the performace
=> loop fusion
=> short circuting
=> lazy evaluation
=> internal iteation
		 */
		
		//i want to get title of all books with price more then or equal 700 sorted as per price
		
		List<String> titles = books.stream()
				.filter(book-> {
					System.out.println("filter is called for book");
					return book.getPrice()>=700;
				})
				.map(book->{
					System.out.println("map is called book -> String");
					return book.getTitle();
				})
				.skip(1)
				.limit(2)
				.collect(Collectors.toList());
		
		System.out.println("---------------");
		
		
		List<Integer> list=Arrays.asList(2,5,6,6,8,8);
		
		list.stream().parallel().forEach(n-> System.out.println(n));
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







