package com.day6.session2.collection_basics;
import java.util.*;
class Car{
	private String color;
	
	public Car(String color) {
		this.color = color;
	}
	public void move() {
		System.out.println("car is moving");
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

}
public class DemoCollection {

	public static void main(String[] args) {
		//ArrayList, LinkedList
		//design to interface
		
		// java 1.5: generics
		// generics : compile time safty net.... type erased*
		List<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(77);
		list.add(88);
		
		myFuncation(list);
		
		for(Integer temp: list) {
			System.out.println(temp.intValue());
		}
	}

	public static void myFuncation(List list) {
		list.add("foo");
		
	}
}




