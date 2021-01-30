package com.day11.oops;

//class : defualt , public 
//inner class: anything

//grade
public class Student{
	private int id; //data /method : private default protected public 
	private  String name;
	private int marks;
	private String result;
	private static String schoolName;

	public Student() {
	}
	

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	
	//Logic
	public String getResult() {
		return "A+";
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
		builder.append(", result=");
		builder.append(getResult()).append(" ").append(schoolName).append(" ");
		builder.append("]");
		return builder.toString();
	}
	
	
	
	//accessor(getter) vs mutator(setter), ctr, logic method
	
	
	
	
}














