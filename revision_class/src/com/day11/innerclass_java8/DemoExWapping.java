package com.day11.innerclass_java8;

import java.util.InputMismatchException;
import java.util.Scanner;


class MyExWapper extends RuntimeException{

	public MyExWapper(String message, Throwable cause) {
		super(message, cause);
	}

	
	
}
public class DemoExWapping {

	
	public static void main(String[] args) {
		
		try {
		myfunction();
		}catch(MyExWapper ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
		}
	}

	private static void myfunction()throws MyExWapper {
		
		int i, j , k;
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("PE the two no");
			i=scanner.nextInt();
			j=scanner.nextInt();
			k=i/j;
			System.out.println(k);
		}catch(ArithmeticException ex) {
			throw new MyExWapper("ArithmeticException", ex);
			
		}catch(InputMismatchException ex) {
			throw new MyExWapper("InputMismatchException", ex);
		}
	}
}






