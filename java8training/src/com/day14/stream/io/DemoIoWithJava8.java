package com.day14.stream.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DemoIoWithJava8 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = Files.newBufferedReader(Paths.get("bookIndex.txt"));
		Stream<String> lines = br.lines();
		lines.forEach(System.out::println);
	}
}
