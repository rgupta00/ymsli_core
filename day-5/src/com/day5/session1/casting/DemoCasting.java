package com.day5.session1.casting;

class A {
	void foof() {
		System.out.println("foof of A");
	}
}

class B extends A {
	void foof() {
		System.out.println("foof of B");
	}

	void foofB() {
		System.out.println("foofB of B");
	}
}

class C extends A {
	void foof() {
		System.out.println("foof of C");
	}

	void foofC() {
		System.out.println("foofC of C");
	}
}

public class DemoCasting {

	public static void main(String[] args) {

		B b=new B();
		A a=b;
		if(a instanceof C) {
		C c=(C) a;
		}else
			System.out.println("are not comptable");
		
	}
}



