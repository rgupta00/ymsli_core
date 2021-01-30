package com.day11.exp;
class A{
	 int i;

	public A(int i) {
		this.i = i;
	}
	
	public A() {
		this(33);
	}
	
}
public class DemoCtrClalling {
	public static void main(String[] args) {
		A a =new A();
		System.out.println(a.i);
	}

}
