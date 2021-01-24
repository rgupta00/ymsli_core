package com.day8.session1;

class MyJob2 implements Runnable {
	private Object ob;

	public MyJob2(Object ob) {
		this.ob = ob;
	}

	@Override
	public void run() {
		System.out.println(ob.hashCode() + " : " + Thread.currentThread().getName());
	}
}

public class DemoSharedDataBwThreads {

	public static void main(String[] args) throws InterruptedException {
		MyJob2 job = new MyJob2(new Object());

		Thread thread1 = new Thread(job);
		Thread thread2 = new Thread(job);

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		System.out.println("-----------");
	}
}
