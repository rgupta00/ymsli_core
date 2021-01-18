package com.day6.session1.clonning;

import java.util.Date;

public class DemoClonning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student student=new Student(121, "rajeev", 60);
		student.setDob(new Date());
		
		Student studentClone=(Student) student.clone();
		studentClone.setName("ravi");
		studentClone.getDob().setDate(15);
		
		System.out.println(student);
		System.out.println(studentClone);
		
	}

	

}
