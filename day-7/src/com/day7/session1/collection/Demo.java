package com.day7.session1.collection;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(44);
		list.add(4);
		list.add(440);
		list.add(64);
		list.add(47);
		list.add(34);
		
		
		
		List<Integer> list2=Arrays.asList();
		boolean result=list.addAll(list2);
		System.out.println(list);
		System.out.println(result);
		
	}
}











