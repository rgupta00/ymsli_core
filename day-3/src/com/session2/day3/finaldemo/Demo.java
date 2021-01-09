package com.session2.day3.finaldemo;

import java.util.*;

interface Payable {
	public double pay();
}

class Consultant implements Payable {
	public double pay() {
		return 545454.8;
	}
}

class Emp implements Payable {
	public double pay() {
		return 545452.8;
	}
}

class PaymentSystem {
	public void calTotalPayable(final List<Payable> employees) {

		// employees=null;
	}
}

class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("id: "+ id);
		System.out.println("name: "+ name);
	}
}

public class Demo {

	public static void main(String[] args) {
		//referene become final not the object
		 final Student student=new Student(121, "raja");
		 Student student2=student;
		
		 student2=null;
	}

}
