package com.day7.session1.collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DemoSetPrintAllUniqueWords {

	public static void main(String[] args) {

		//u have to print words with freq: map
		Set<String> words = new TreeSet<>();
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader("story.txt"));
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					words.add(token.toLowerCase());
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		}
		
		System.out.println(words);

	}

}
