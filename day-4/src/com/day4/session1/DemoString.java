package com.day4.session1;

class Emp extends Object {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Emp(int id) {
		this.id = id;
	}

}

public class DemoString {
	public static void main(String[] args) {
		// hashcode of the object is not the actual address of object
		// but java use actual addess of object to calculate hashcode
		// why java dont give actual addess :security purpose

		// add + logic --> no

		// Emp emp1=new Emp(44);
		//
		// Emp emp2=new Emp(44);// state is same
		//
		// //
		//
		// System.out.println(emp1.hashCode());
		//
		// System.out.println(emp2.hashCode());

		String s1 = "india";
		//what intern() do? it tell java to look the contents in pool if it is there
		// then ignore new operator and assign pointer to same object
		String s2 = new String("india").intern();
		String s3 = new String("india");
		
		if (s3 == s2)
			System.out.println("are same");
		else
			System.out.println("are not same");

		//
		//
		// String s1="india us";
		// s2=s2+" us";
		//
		// if(s1==s2)
		// System.out.println("are same");
		// else
		// System.out.println("are not same");
	}

}
