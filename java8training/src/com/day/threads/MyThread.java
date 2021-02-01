package com.day.threads;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread {

	static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}

		list.add("D");
	}

	public static void main(String[] args) throws InterruptedException {

		list.add("A");
		list.add("B");
		list.add("C");

		MyThread myThread = new MyThread();
		myThread.start();

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println("main thread iterating...." + itr.next());
			Thread.sleep(3000);
		}

		System.out.println("---------");
		System.out.println(list);
	}
}
