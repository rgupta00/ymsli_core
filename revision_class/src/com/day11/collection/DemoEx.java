package com.day11.collection;

import java.io.IOException;

class InputException extends Exception{

	public InputException(String message, int n) {
		super(message+ ": "+ n);
		// TODO Auto-generated constructor stub
	}
	
}
class ExceptionEx{
	
	public void throwException()throws InputException,IOException{
		//
	}
}

public class DemoEx {
	
	public static void main(String[] args) {
		ExceptionEx exDemo=new ExceptionEx();
		
		try {
			exDemo.throwException();
		} catch (InputException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
