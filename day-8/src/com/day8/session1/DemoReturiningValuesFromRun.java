package com.day8.session1;

import java.util.concurrent.TimeUnit;

class Cal implements Runnable {
	private int x, y, sum;
	private volatile boolean isDone=false;
	
	public Cal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch (InterruptedException e) {
		}
		sum = x + y;
		isDone=true;
		synchronized (this) {
			notify();
		}
	}

	public int getSum() {
		while(!isDone) {
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return sum;
	}

}

public class DemoReturiningValuesFromRun {
	public static void main(String[] args) throws InterruptedException {
		Cal cal=new Cal(3,2);
		Thread thread=new Thread(cal);
		thread.start();
		
		System.out.println(cal.getSum());
		System.out.println("---------");
	}

}
