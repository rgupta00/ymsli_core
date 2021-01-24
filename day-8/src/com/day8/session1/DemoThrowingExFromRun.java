package com.day8.session1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;


class MyDefaultUncaugtExHandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("handled by default handler");
		System.out.println("thread :"+ t.getName());
		System.out.println(e.getCause());
	}
	
}

class MyUncaugtExHandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("handled by specific handler");
		System.out.println("thread :"+ t.getName());
		System.out.println(e.getCause());
	}
	
}


class MyExWrapper extends RuntimeException{
	private static final long serialVersionUID = 5817470765823340062L;
	public MyExWrapper(Throwable cause) {
		super(cause);
	}
}
class MyJob implements Runnable{

	@Override
	public void run()throws MyExWrapper {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("foo.txt"));
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			throw new MyExWrapper(e);
		} catch (IOException e) {
			throw new MyExWrapper(e);
		}
	
	}
	
}
public class DemoThrowingExFromRun {
	
	public static void main(String[] args) {
	
			MyJob job=new MyJob();
			
			Thread.setDefaultUncaughtExceptionHandler(new MyDefaultUncaugtExHandler());
			
			Thread thread=new Thread(job,"my worker");
			Thread thread2=new Thread(job,"my worker 2");
			
			thread.setUncaughtExceptionHandler(new MyUncaugtExHandler());
			thread.start();
			thread2.start();
	
		
	}
}






