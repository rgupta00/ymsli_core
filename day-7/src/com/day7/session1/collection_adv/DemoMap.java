package com.day7.session1.collection_adv;
import java.util.*;

public class DemoMap {

	public static void main(String[] args) {
		
		//IdentityHashMap<K, V>
		IdentityHashMap<Integer, String>map=new IdentityHashMap<>();
		Integer it1=new Integer(33);
		System.out.println(it1.hashCode());
		Integer it2=new Integer(33);
		System.out.println(it2.hashCode());
		map.put(it1, "foo marks");
		map.put(it2, "bar marks");
		
		System.out.println(map);
		
		
		
//		HashMap<Integer, String>map=new HashMap<>();
//		Integer it1=new Integer(33);
//		Integer it2=new Integer(33);
//		
//		map.put(it1, "foo marks");
//		map.put(it2, "bar marks");
//		
//		System.out.println(map);
	}
}
