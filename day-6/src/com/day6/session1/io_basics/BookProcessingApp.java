package com.day6.session1.io_basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BookProcessingApp {
	// print each word of a file ...
	public static void main(String[] args) {
		String line=null;
		try (BufferedReader br = new BufferedReader(new FileReader(new File("bookrec.txt")))){
			while((line=br.readLine())!=null) {
				//i need to read all words of files
				String []tokens=line.split(" ");
				for(String token : tokens) {
					System.out.println(token.toLowerCase());
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
