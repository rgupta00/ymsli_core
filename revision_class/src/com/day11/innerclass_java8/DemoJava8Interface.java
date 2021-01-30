package com.day11.innerclass_java8;
import java.util.*;
//java 8 : interface 
interface A {
	default public void boof() {
		System.out.println("boof default method A");
	}
	public static void boofStatic() {
		System.out.println("boof static ...");
	}
}


class AImpl implements A{
	
	public void boof() {
		System.out.println("boof imp");
	}
}

public class DemoJava8Interface {

	public static void main(String[] args) {
		//Why static method are now allowed inside a interface?
		List<String> list=Arrays.asList("raj","gun","foo");
		//List.sort(list)
		Collections.sort(list);
		
		
		
		A a=new AImpl();
		A.boofStatic();
		
	}

}
