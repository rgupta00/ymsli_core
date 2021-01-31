package com.day1.session1.ex1;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.day1.session1.ex2.Book;

public class DemoFI {
	
	public static void main(String[] args) {
		
		Function<String, Integer>function= s-> s.length();
		
		System.out.println(function.apply("amit gupta"));
		
		//Book --> price
		Function<Book, Double>function2=book-> book.getPrice();
		
		//Book --> BookPojo
		
		//Function<Book, BookPojo>function3= book-> new BookPojo(book.getTitle(), book.getPrice());
			
		BiFunction<Book, Book, Double>biFunction=( b1,  b2)->b1.getPrice()+ b2.getPrice();
		
		Consumer<String> consumer= s-> System.out.println(s);
			
		BiConsumer<String, String>biConsumer=( t,  u)-> System.out.println(t +" : " + u);
			
		consumer.accept("java is changed since java 8");
		
		biConsumer.accept("java", "love");
		
		Supplier<Integer>supplier=()->  55;
		
		System.out.println(supplier.get());
		
		Supplier<Book>supplier2=()->new Book(12, "java", "raj", 500);
		
		Supplier<RuntimeException> supplier3=()-> new RuntimeException();
		
		
		/*
		 * 1. predicate 		boolean test(T)
		 * 2. funcation				take something and covert into something else
		 * 3. consumer : it take something dont return anything
		 * 4.Supplier : it return something but dont take anything (aka factory dp)
		 */
	}

}





