package com.java8.mcq;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoMcq {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("foo ", "bar ", "jar ", "car ");
		Collections.sort(strings, ( str1,  str2)-> str2.compareTo(str1));
		
		strings.forEach(string -> System.out.print(string));
	}

}
