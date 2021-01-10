package com.day4.session1;

public class DemoStringVsSB {

	public static void main(String[] args) {
		//String dont have have reverse method ...
		String a="india";
		
		String aRev=new StringBuilder(a).reverse().toString();
		
		System.out.println(a);
		
	}
}
