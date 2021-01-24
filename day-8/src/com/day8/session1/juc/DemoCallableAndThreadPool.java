package com.day8.session1.juc;
//Runnable vs Callable

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Factorial implements Callable<Long> {
	long n;

	public Factorial(long n) {
		this.n = n;
	}

	public Long call() throws Exception {
		try {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName());
		}catch(InterruptedException e) {
			
		}
		if (n <= 0) {
			throw new Exception("for finding factorial, N should be > 0");
		}
		long fact = 1;
		for (long longVal = 1; longVal <= n; longVal++) {
			fact *= longVal;
		}
		return fact;
	}
}
public class DemoCallableAndThreadPool {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Long> callable=new Factorial(5);
		//Process : IO bound process vs cpu bound process
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		Future<Long> submit = executorService.submit(callable);//non blocking code, promise
		executorService.shutdown();// hey ts i have no job for u right now...
		System.out.println("hello");
		Long long1 = submit.get();// bloking code
		System.out.println(long1);
		
	}

}
