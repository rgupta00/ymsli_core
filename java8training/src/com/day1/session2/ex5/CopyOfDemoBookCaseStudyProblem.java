package com.day1.session2.ex5;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;



public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
		
//		Stream<Book> stream3 = allBooks.stream();
//		Stream<Book> stream2 = stream3;
//		Stream<Book> stream = stream2;
//		List<Book>booksWithMOrethen400Pages=
//				stream
//				.filter(b-> b.getPages() >=400)
//				.collect(toList());
//		
//		
//		// 2. Find all books that are java books and more then 400 pages
//		
//		Predicate<Book>javaBookPredicate=b->b.getSubject()==Subject.JAVA;
//		Predicate<Book>bookWithMorethen400PagesPredicate=b->b.getPages()>=400;
//		List<Book>books2=
//				stream
//				.filter(javaBookPredicate.and(bookWithMorethen400PagesPredicate))
//				.collect(toList());
		
		// 3. We need the top three longest books
	
		// 4. We need from the fourth to the last longest books

		// 5. We need to get all the publishing years
//
//		List<Integer> allYears=stream
//				.map(b-> b.getYear())
//				.distinct()
//				.collect(toList());
		
		// 6. We need all the authors names who have written a book		
		//List books ---> list author--> names
		
//		List<String> authorsName=
//				allBooks.stream()
//				.flatMap(book-> book.getAuthors().stream())
//				.map(a-> a.getName())
//				.distinct()
//				.sorted()
//				.collect(toList());
//		authorsName.forEach(name->System.out.println(name));
		
		
		// We need all the origin countries of the authors
		
//		List<String> authorsCountryName=
//				allBooks.stream()
//				.flatMap(book-> book.getAuthors().stream())
//				.map(a-> a.getCountry())
//				.distinct()
//				.sorted()
//				.collect(toList());
//		authorsCountryName.forEach(cname->System.out.println(cname));
		

		// We want the most recent published book.
	
		Optional<Book> min = allBooks.stream()
		.min(Comparator.comparing(Book::getYear));
		
		System.out.println(min.map(b-> b.getTitle()).orElse("book is not found"));
		
		//Optional<T>
		// We want to know if all the books are written by more than one author
	
		boolean allMatch = allBooks.stream()
		.allMatch(b-> b.getAuthors().size()>1);
		System.out.println(allMatch);
		
		
		// We want one of the books written by more than one author. (findAny)
		
		// We want the total number of pages published.

	
		// We want to know how many pages the longest book has.

	
		// We want the average number of pages of the books
	
		// We want all the titles of the books

	
		// We want the book with the higher number of authors?

	
		// We want a Map of book per year.

		Map<Integer, List<Book>> map1=
				allBooks.stream()
				.collect(Collectors.groupingBy(Book::getYear));
		
		map1.forEach(( year, books)-> System.out.println(year + " : "+ books));
		
		
		//how to iterate throgh map in java 8
		
		Map<String, Integer> stMarks=new HashMap<>();
		stMarks.put("ravi", 90);
		stMarks.put("tarun", 80);
		stMarks.put("gunika", 70);
		
		stMarks.forEach(( name,  marks)-> System.out.println(name + ": " + marks));
		

		// We want to count how many books are published per year.

	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2010, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("c++ in action", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
