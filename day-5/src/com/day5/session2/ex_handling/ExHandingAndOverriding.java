package com.day5.session2.ex_handling;

import java.io.IOException;

import javax.naming.AuthenticationException;

//class AEx extends Exception{}
//
//class BEx extends AEx{}
class A {
	public A() throws Exception{
		System.out.println("ctr of class A");
	}
}

class B extends A {

	// ctr of drived class can not throw lesser ex then base class?
	public B()throws Exception {
		super();
		System.out.println("ctr of class B");
	}
}

public class ExHandingAndOverriding {

	public static void main(String[] args) {

		
	}
}
