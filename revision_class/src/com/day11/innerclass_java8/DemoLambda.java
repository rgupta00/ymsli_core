package com.day11.innerclass_java8;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.Callable;

//
//@FunctionalInterface
//interface Cookable{
//	public void cook();
//	
//	public default void preCook() {
//		System.out.println("get the stuff ready");
//	}
//	public static void cookStatic() {
//		System.out.println("pre cook static ");
//	}
//}

interface Cal{
	public int mul(int a, int b);
}
interface Sqr{
	public double getSqr(double a);
}


public class DemoLambda {

	public static void main(String[] args) {
		
		//hidden files from
		
		File dir=new File("/home/raj/Desktop/ALL DESKTOP STUFF");
		
		if(dir.isDirectory()) {
		
			File[]files=dir.listFiles(File::isDirectory);
			
			for(File file: files) {
				System.out.println(file.getName());
			}
		}
		
		
		
		
//		
      	Cal cal=(a, b) -> a*b;
      	System.out.println(	cal.mul(20, 16));
      	
//		Sqr sqr=a-> a*a;
//		
//		Callable<Long>callable=()->  new Long(44);
		
		
		
		
		//Cookable cookable=()-> System.out.println("streat food");
			
	
		
	}
}
