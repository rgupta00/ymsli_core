package com.day.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

//runnable vs callable
//Job
class Factorial implements Callable<Long>{
	long n;

	public Factorial(long n) {
		this.n = n;
	}

	public Long call() throws Exception {
		if (n <= 0) {
			throw new Exception("for finding factorial, N should be > 0");
		}
		long fact = 1;
		for (long longVal = 1; longVal <= n; longVal++) {
			fact *= longVal;
		}
		try {
			Thread.sleep(500);
		}catch(InterruptedException ex) {}
		return fact;
	}
}
public class DemoTP {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		Factorial factorial=new Factorial(5);
		System.out.println("in main");
		Future<Long> submit = executorService.submit(factorial);//it do not block the main threads
		
		
		System.out.println("in main");
		
		Long long1 = submit.get();///blocking code
		System.out.println("in main");
		System.out.println(long1);
		
		
		executorService.awaitTermination(10, TimeUnit.MINUTES);
		executorService.shutdown();//i have given u all job that i want, dont expect any new job
		System.out.println("--------------");
		
	}
}





