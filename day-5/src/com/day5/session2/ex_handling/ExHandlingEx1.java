package com.day5.session2.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExHandlingEx1 {

	public static void main(String[] args) {
		int x, y ,z;
		
		
		//java 1.6
		//java 1.7: short syntex : if we have many catch block
		Scanner scanner=null;
		try {
			scanner=new Scanner(System.in);
			System.out.println("PE value of x");
			x=scanner.nextInt();
			
			System.out.println("PE value of y");
			y=scanner.nextInt();
			
			 z=x/y;
			
			System.out.println(z);
		}
		catch( ArithmeticException |InputMismatchException ex) {
			System.out.println(ex);
		}finally {
			scanner.close();
		}
		System.out.println("hello");
	}
}
