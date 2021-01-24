package com.day7.session2.threads;

public class DemoDL {

	public static void main(String[] args) {
		final String r1 = "bat";
		final String r2 = "ball";

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread1 get lock on r1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					synchronized (r2) {
						System.out.println("thread1 get lock on r2");
					}
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread2 get lock on r1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					synchronized (r2) {
						System.out.println("thread2 get lock on r2");
					}
				}

			}
		});

		thread1.start();
		thread2.start();
	}
}
