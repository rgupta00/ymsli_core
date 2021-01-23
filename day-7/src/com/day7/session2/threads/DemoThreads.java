package com.day7.session2.threads;

//threads
class Job implements Runnable {

	@Override
	public void run() {
		System.out.println("the job is started by thread" + Thread.currentThread().getName());

		// blocking code
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("the job is end by thread" + Thread.currentThread().getName());

	}

}

public class DemoThreads {

	public static void main(String[] args) {
		System.out.println("the job of the thread...." + Thread.currentThread().getName());

		Job job = new Job();
		Thread thread1 = new Thread(job, "foo");
		Thread thread2 = new Thread(job, "bar");

		// Thread life cycle
		thread1.start();
		thread2.start();

		//thread join
		try {
			thread1.join(5000, 1000);
			thread2.join(5000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("main finished..");
	}
}






