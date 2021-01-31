package com.day11.collection;

class NumberPrinter implements Runnable {
	
	private int counter=0;
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 30; i++) {
				System.out.println("No " + counter++ + " printed by " + Thread.currentThread().getName());
			}
		}
	}
}

public class DemoTh1 {
	public static void main(String[] args) {

		NumberPrinter printer=new NumberPrinter();
		Thread thread1=new Thread(printer);
		Thread thread2=new Thread(printer);
		Thread thread3=new Thread(printer);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
