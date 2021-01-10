package com.day4.session1;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		int radius;
		String color;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE rad");
		radius =scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter color");
		
		color=scanner.nextLine();
		System.out.println(radius);
		System.out.println(color);
	}
}
