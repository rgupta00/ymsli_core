package com.day5.session2.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExHandlingExARM {

	public static void main(String[] args) {
		int x, y ,z;
		
		
		
		try (Scanner scanner=new Scanner(System.in)){
		
			System.out.println("PE value of x");
			x=scanner.nextInt();
			
			System.out.println("PE value of y");
			y=scanner.nextInt();
			
			 z=x/y;
			
			System.out.println(z);
		}
		catch( ArithmeticException |InputMismatchException ex) {
			System.out.println(ex);
		}
		System.out.println("hello");
	}
}
