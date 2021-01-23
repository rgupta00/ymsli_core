package com.day7.session1.collection_adv;
import java.util.*;
public class DemoArrayToList {

	public static void main(String[] args) {
		
		String s[]={"a","b","c"};// array  is staitc , dont grow at run time

		List l=Arrays.asList(s);
		//l.remove(0);
		l.set(0, new StringBuilder());
		System.out.println(l);
		
	}
}
