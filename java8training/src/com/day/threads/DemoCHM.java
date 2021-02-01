package com.day.threads;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class DemoCHM {

	public static void main(String[] args) {
		//it have provision of 1 lock per buckets : 
		ConcurrentHashMap<String, String>map=new ConcurrentHashMap<>
		(16	, .75f, 8);
		
		
		
		//is the map is thread safe :NO
		//Map<String, String> map=new HashMap<>();
		
		//it is a threasafe version of map: syn
		//Map<String, String> map2=Collections.synchronizedMap(map);
		
		
	}
}
