package com.java8.mcq;

class Foo{
	private int i=66;
	
	void foof() {
		final int k=44;
		Runnable runnable = () ->{	
				System.out.println(k);
		};
	
		runnable.run();
	}	
}
public class AnnInnerClassVsLambda {

	public static void main(String[] args) {
		Foo foo=new Foo();
		foo.foof();
	}
	
}
