package com.session1.day3.overloading;

class Cal {

	public void foo(String[] s) {
		System.out.println("public void foo(String[] s)");
	}
	public void foo(Object[] s) {
		System.out.println("public void foo(Double[] s)");
	}
	
	/*public Integer add(Integer a, Integer b) {
		System.out.println("public Integer add(Integer a, Integer b)");
		return a+b;
	}
	//variable argument method ..Java 1.5
	public int add(int ...a) {
		System.out.println("public int add(int ...a) ");
		int sum=0;
		for(int temp: a) {
			sum+=temp;
		}
		return sum;
	}*/
	//Wrapper classes: 8 primitive classes
	
//	public double add(double a, int b) {
//		System.out.println("public double add(double a, int b) ");
//		return a+b;
//	}
	
	
//	public int add(int a, int b) {
//		System.out.println("public int add(int a, int b) ");
//		return a+b;
//	}
//
//	public int add(int a, int b, int c) {
//		System.out.println("public int add(int a, int b,int c) ");
//		return a+b+c;
//	}
}

public class DemoOverloading {

	public static void main(String[] args) {
		Cal cal=new Cal();
		cal.foo(null);
		//System.out.println(cal.add(3,3));
	}
}






