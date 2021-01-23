package com.day7.session1.collection;
import java.util.*;
import java.util.Map.Entry;
public class DemoHashMap {
	public static void main(String[] args) {
		//Map: K--> V
		
		Map<String , Integer>map=new HashMap<>();
		map.put("raj", 90);
		map.put("gun", 91);
		map.put("keshav", 90);	
		map.put("ekta", 95);
		
		//iterate it
		
		//key set
		
//		Set<String> keySet = map.keySet();
//		for(String key: keySet) {
//			System.out.println(key + " : "+ map.get(key));
//		}
//		
		
		//entry set: better
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + ": "+ entry.getValue());
		}
		
		
		//search opeatation in map have constant run time
		//O(1)
		//System.out.println(map.get("raj"));
		
//		System.out.println(map.isEmpty());
//		System.out.println(map.containsKey("gun2"));
//		
//		//map : keyset, entryset
//		//Shift + Alf+L
//		Set<String> keySet = map.keySet();
//		for(String key: keySet) {
//			System.out.println(key+" : "+ map.get(key));
//		}
		
	}

}
