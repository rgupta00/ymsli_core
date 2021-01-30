package com.day11.exp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.day11.oops.Student;

public class StudentTester {

	public static void main(String[] args) throws ClassNotFoundException {
		// static vs dynaic loading of the class

		Student student=new Student();
		
		Class clazz = Class.forName("com.day11.oops.Student");
		
		Class class1=student.getClass();
		
		Class class2=Student.class;
		
	}
}
