package com.session2.day3.interface1;
interface C1{
	public abstract void foof() ;
}

class A2{
	void foof() {
		System.out.println("foof of A2");
	}
}

class B2 extends A2 implements C1{
	public void foof() {
		System.out.println("foof of A2");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		
	}
}
