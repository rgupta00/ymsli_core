package com.day7.session1.collection_adv;
import java.util.HashMap;
import java.util.TreeMap;
public class DemoMapSorted {
	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put("foo", "foo");
		map.put(new StringBuilder("bar"), "bar");
		
//		/*
//		 * 	
//		101	-> A
//		103	-> B
//		104	-> C
//		107	-> D
//		125	-> E
//		136	-> F
//		 */
//		TreeMap<Integer , String>map=new TreeMap<>();
//		if(map instanceof SortedMap) {
//			System.out.println("yes");
//		}
//		map.put(101, "A");
//		map.put(103, "B");
//		map.put(104, "C");
//		map.put(107, "D");
//		map.put(125, "E");
//		map.put(136, "F");
//		System.out.println(map.headMap(107));
//		System.out.println(map.tailMap(107));
//		System.out.println(map.firstKey());
//		System.out.println(map.lastKey());
//		
//		System.out.println(map.subMap(104, 125));
		
	}
}








