package com.session1.doubts;
class Foo {
	private int id;

	public Foo(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static void print() {
		System.out.println("print static method ...");
	}
}
public class DemoStatic {
	
	public static void main(String[] args) {
		
		Foo f=null;
		f.print();
	}

}
