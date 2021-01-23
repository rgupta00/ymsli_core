package com.day7.session1.doubts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
//jar file: java archive
public class Foo {

	public Foo() throws IOException,SQLException{
		BufferedReader br=new BufferedReader
				(new FileReader("/home/raj/Documents/ymsli/core/day-7/foofile.txt"));
	}
	
	public void doWork() {
		System.out.println("----------------");
	}
}
