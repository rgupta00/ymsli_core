package com.day7.session1.collection;
import java.util.*;
class SortAsPerMarks implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o2.getMarks(), o1.getMarks());
	}
	
}
class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int marks;
	
	//boilerplate code: project lombok
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
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Student() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", marks=");
		builder.append(marks);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int hashCode() {
		return name.length();
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
	public int compareTo(Student o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
	
	
}
public class DemoSetForStudent {
	
	public static void main(String[] args) {
		//Whenever u are using hashset or hashmap dont forget to override hashcode method
		//it must sort the data
		Set<Student> students=new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getMarks(), o1.getMarks());
			}
		});
		students.add(new Student(1, "ekta", 91));
		students.add(new Student(1, "ekta", 91));
		students.add(new Student(129, "keshav", 90));
		students.add(new Student(12, "raja", 98));
//		
		for(Student s: students) {
			System.out.println(s);
		}
	}

}



