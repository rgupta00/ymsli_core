package com.session1.day3.overriding;
interface A{
	int i=88; //public static final int i=88;
	void foof() ;
}

interface B{
	int i=77;////public static final int i=88;
	void foof();
}


class C implements A, B{
	public void foof() {
		System.out.println("hello..."+B.i);
	}
}


public class DiamondProblem {

	public static void main(String[] args) {
		
	}
}
