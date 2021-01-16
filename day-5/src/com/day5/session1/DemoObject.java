package com.day5.session1;

import java.util.*;

class Student implements Cloneable {
	private int id;
	private String name;
	private int marks;
	private Date dateOfBirth;

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int id, String name, int marks, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.dateOfBirth = dateOfBirth;
	}

	public Student() {
	}

//
//	@Override
//	public int hashCode() {
//		return name.length();
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", marks=");
		builder.append(marks);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public Student clone() throws CloneNotSupportedException {
		
		Student clonnedObject= (Student) super.clone();
		
		clonnedObject.dateOfBirth=(Date) this.dateOfBirth.clone();
		return clonnedObject;
	}

	@Override
	protected void finalize() throws Throwable {
		//i am telling GC , hey when u remove a object of this calss, dont forget to call it just before
		//it : we dont have any gurantee when gc is going to be called
		//hence dont rely on this method...
		System.out.println("i am called...");
	}

	
	
}

public class DemoObject {

	public static void main(String[] args) throws CloneNotSupportedException {

		Date date=new Date(2011, 5, 11);
		
		Student student1 = new Student(21, "gunika", 48, date);

		student1=null;
		
		System.gc();// it "request" the gc to come one!
		Runtime.getRuntime().gc();
		
		//1:15   1:45-3:30 3:30 -6PM
//		Student studentClone = (Student) student1.clone();
//
//		System.out.println("before changing....");
//
//		System.out.println(student1);
//		System.out.println(studentClone);
//
//		studentClone.getDateOfBirth().setDate(22);
//		studentClone.setName("gunika gupta");
//		System.out.println("after changing....");
//
//		System.out.println(student1);
//		System.out.println(studentClone);

//		Student student2 = new Student(21, "gunika", 48);
//		
//		HashSet<Student> hashSet=new HashSet<>();
//		hashSet.add(student1);
//		
//		System.out.println(hashSet.contains(student2));
//		
		// Student student2 = new Student(21, "gunika", 48);

		/*
		 * System.out.println(student1);
		 * 
		 * // we have to override equals method if (student1.equals(student2)) {
		 * System.out.println("are eq"); } else System.out.println("Are not eq");
		 */

	}

}
