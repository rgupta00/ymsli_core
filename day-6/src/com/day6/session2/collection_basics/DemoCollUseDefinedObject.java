package com.day6.session2.collection_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoCollUseDefinedObject {
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		
		list.add(new Student(121, "raj", 40));
		list.add(new Student(11, "raj", 48));
		list.add(new Student(21, "hari", 42));
		list.add(new Student(66, "gunika",49));
		//Comparable , Compartor?
		//OCP
		
		System.out.println("------sorting by id--------");
		Collections.sort(list);
		
		Iterator<Student> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------sorting by name-------");
		Collections.sort(list, new NameSorter());
		
		 it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------sorting by marks-------");
		Collections.sort(list, new MarksSorter());
		
		 it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}








