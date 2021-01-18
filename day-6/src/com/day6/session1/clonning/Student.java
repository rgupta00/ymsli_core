package com.day6.session1.clonning;

import java.util.Date;

public class Student implements Cloneable{
	private int id;
	private String name;
	private double marks;
	
	private Date dob;// LocalDate
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	protected Student clone() throws CloneNotSupportedException {
		
		Student stCloned= (Student) super.clone();//shallow copy
		stCloned.dob=(Date) dob.clone();// pl give a sepeate copy of immutable date
		return stCloned;
		
		// shallow copy vs deep copy
	}
	
	public Student() {
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", marks=");
		builder.append(marks);
		builder.append(", dob=");
		builder.append(dob);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
