package com.day7.session1.doubts;
import java.io.*;

public class DemoIO {
	//BPP: never throw ex from main:
	public static void main(String[] args)  {
		try {
			BufferedReader br=new BufferedReader
					(new FileReader("/home/raj/Documents/ymsli/core/day-7/foofile.txt"));
			System.out.println("....");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
