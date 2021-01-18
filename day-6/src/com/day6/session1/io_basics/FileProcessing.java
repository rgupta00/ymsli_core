package com.day6.session1.io_basics;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileProcessing {
	// print each word of a file ...
	public static void main(String[] args) {
		Set<String>words=new TreeSet<>();
		
		String line=null;
		try (BufferedReader br = new BufferedReader(new FileReader(new File("demo.txt")))){
			while((line=br.readLine())!=null) {
				//i need to read all words of files
				String []tokens=line.split(" ");
				for(String token : tokens) {
					words.add(token.toLowerCase());
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		//print the set
		for(String word:words ) {
			System.out.println(word);
		}
	}

}
