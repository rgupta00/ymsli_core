package com.day6.session2.collection_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoColl2 {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(88);
		list.add(90);
		list.add(4);
		list.add(77);
	
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		///BS
		int index=Collections.binarySearch(list, 89);
		
		System.out.println(index);
		
		//enhance for loop : sy suger : iterator dp, cursor 
		// 3 kind of iterator
		//: ListIterator: curd op
		//Iterator(univeral cursor): iterate, also del of an element
		//Enumarator(Vector): iterate
//		
//		ListIterator<Integer> it=list.listIterator(list.size());
//	
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
		//CRUD op using ListIterator
		
		//System.out.println(list);
	}
}








