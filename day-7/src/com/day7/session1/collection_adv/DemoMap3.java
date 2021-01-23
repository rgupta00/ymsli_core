package com.day7.session1.collection_adv;
import java.util.*;
public class DemoMap3 {

	public static void main(String[] args) {
		
		NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();
		examScores.put(90, "gun");
		examScores.put(20, "raj");
		examScores.put(10, "ekta");
		examScores.put(50, "keshav");

		System.out.println("The data in the map is: " + examScores);
		
		//decending order of key
		System.out.println("The data descending order is: " + examScores.descendingMap());
	
		// those get more then 40
		System.out.println("Details of those who passed the exam: " + examScores.tailMap(40));
		
	//	System.out.println("The lowest mark is: " + examScores.firstEntry());//lowest

//
//		More methods:
//		-------------------
//		headMap()//those fail the exam
//		higherEntry()//immdeiate below passing marks
//		lowerEntry() //..........above..........
//
//		firstEntry() :lowest key value
//		lastEntry()  : highest key value
	}
}
