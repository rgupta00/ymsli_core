package com.day7.session1.collection;
import java.util.*;
public class DemoSet {
	
	public static void main(String[] args) {
		//HashSet: faster nor sorted nor ordered
		
		//LinkedHashSet<E>
		//TreeSet<E>
		
		Set<String> words=new TreeSet<>();
		System.out.println(words.add("foo"));
		System.out.println(words.add("foo"));
		words.add("bar");
		words.add("jar");
		words.add("car");
		words.add("hari");
		
		System.out.println(words);
		
	}

}
