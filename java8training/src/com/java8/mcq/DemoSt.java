package com.java8.mcq;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoSt {

	public static void main(String[] args) {

		List<String>list=Arrays.asList("java","is","fun");
		Stream<String> s=list.stream();
		s.forEach(System.out::println);
		
		 s=list.stream();
		s.forEach(System.out::println);
	}
}
