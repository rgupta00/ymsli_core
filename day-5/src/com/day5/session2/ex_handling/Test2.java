package com.day5.session2.ex_handling;


// This class contains an instance of Test1
class Test1{
	 Test1() {
		System.out.println("test1");
	}
	void foof() {
		System.out.println("foof of Test1");
	}
}
public class Test2 {
	private int i;
	Test2(int i) {
		this.i=i;
		System.out.println("its a ctr");
	}
	// Test2 t2 = new Test2(5);
	Test1 t=new Test1();
	
	public static void main(String[] args) {
		Test2 t3 = new Test2(5);
	}
}
