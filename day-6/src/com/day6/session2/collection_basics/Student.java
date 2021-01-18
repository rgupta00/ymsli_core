package com.day6.session2.collection_basics;

import java.util.Comparator;
import java.util.Date;

class NameSorterThenMarksSorter implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		int val = o1.getName().compareTo(o2.getName());
		// gpp: early return

		if (val != 0) {
			return val;
		} else {
			return Double.compare(o2.getMarks(), o1.getMarks());

		}
	}
}

class MarksSorter implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
}

class NameSorter implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

final public class Student implements Comparable<Student> {
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

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.getId(), o.getId());
	}

}
