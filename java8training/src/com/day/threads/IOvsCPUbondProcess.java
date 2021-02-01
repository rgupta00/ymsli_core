package com.day.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class IOBondProcess implements  Runnable {
	public void run() {
		for(long i=0;i<10000000;i++)
			;
		System.out.println("job of threads");
	}
}
public class IOvsCPUbondProcess {
	
	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(100);
		
	}

}
