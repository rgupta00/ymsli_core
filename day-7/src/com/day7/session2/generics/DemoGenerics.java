package com.day7.session2.generics;
import java.util.*;

import com.day7.session1.pojo.Student;
//Generics is a compile time safty net
//Never mix gen with non gen code

public class DemoGenerics {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		List<Object> list2=new ArrayList<>();// better way to create hectrogenious ds
		
		
		
		//List<?> foo=new ArrayList<>();
		
		
		
		List<Student> sList=new ArrayList<>();
		sList.add(new Student(12, "raja"));
		sList.add(new Student(102, "choor"));
		
		
//		List<Integer> list=new ArrayList<>();
//		list.add(6);
//		list.add(56);
//		list.add(60);
//		list.add(633);
//		
//	
//		List<Double> list2=new ArrayList<>();
//		list2.add(55.77);
//		list2.add(95.9);
//		list2.add(5.707);
//		list2.add(517.8);
//		list2.add(54.9);
		
		//PECS (short for Producer extends and Consumer super)
		
		printList(list);
		
		printList(list2);
		
		printList(sList);
	
	}
	//What is PECS (Producer Extends Consumer Super)?
	//--------------------------------------------------
	//? super XXX: if u want to add the item but not want to iterate
	
	//? extends XX: if u want to iterate not want to add a time
	
	//T
	private static void printList(List<?> list) {
		//list.add("foo");
		for(Object temp: list) {
			System.out.println(temp);
		}
	}

	//hey java i want to pass any object collection that have something to do with "Object" class
	// i promise i will not change it
//	private static void printList(List<? extends Object> list) {
//		for(Object temp: list) {
//			System.out.println(temp);
//		}
//	}
}





