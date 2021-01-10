package com.day4.session1;

import java.util.Arrays;
import java.util.Date;

class Val {
	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Val(double value) {
		this.value = value;
	}
}
/*
 * if u want to create a immutable object that contain
 *  -> composition of another immutable object ( String, Integer ...) : do nothing
 *  -> composition of another mmutable object: then u have to copy that object
 *  		or clone it ( u can not use the same object)
 *  	otherwise it would not be a immutable class/ object
 */
final class MyImmtableClass {
	private final int id;
	private final Val val;// u should create a copy/clone
//	private final String name;
//	private Date date;
	private final int arr[];

	public MyImmtableClass(int id, Val val, int arr[]) {
		super();
		this.id = id;
		// this.val=val;// we have same object pointed by two ref
		this.val = new Val(val.getValue());// i have create new object and that object is pointed by ref val
		//this.arr = arr;
		this.arr=Arrays.copyOf(arr, arr.length);//safer way to deal with array while create immutable objects
	}

	public int getId() {
		return id;
	}

	public Val getVal() {
		return new Val(getVal().getValue());
	}

	public int[] getArr() {
		return arr;
	}

	public void print() {
		System.out.println("id:" + id);
		System.out.println("value: " + val.getValue());
		System.out.println("---content of array----");
		for(int temp: arr) {
			System.out.print(temp+" ");
		}
		System.out.println();
	}

}

public class Demo {

	public static void main(String[] args) {
		Val val = new Val(800.00);
		
		int arr[]= {6,7,8};
		
		MyImmtableClass imm = new MyImmtableClass(44, val, arr);

		imm.print();
		
		arr[2]=777;
		
		imm.print();
	}
}
