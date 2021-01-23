package com.day7.session1.doubts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//ARM: u dont to clean the shit
public class DemoArm {
	
	public static void main(String[] args) {
		
		try (BufferedReader br=new BufferedReader
				(new FileReader("/home/raj/Documents/ymsli/core/day-7/foofile.txt"))){
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
