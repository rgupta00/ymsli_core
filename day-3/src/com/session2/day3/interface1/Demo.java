package com.session2.day3.interface1;

interface Foo {
	int i = 9;
	//*
	default public void foo() {
		System.out.println("i am default imp of Foo");
	}
}

interface Bar {
	int i = 99;
	default public void foo() {
		System.out.println("i am default imp of Bar");
	}
}
class A1 implements Foo, Bar{
	public void foo() {
		Foo.super.foo();
		Bar.super.foo();
		System.out.println("i am default imp of Foo");
	}
}

public class Demo {
	public static void main(String[] args) {

	}

}
