package com.day11.collection;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//juc package:Lock: fairness 
class Printer {

	private Lock lock = new ReentrantLock(true);

	public void print(String letter) {

		try {
			lock.lock();

			System.out.print("[" + letter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("]");
		}finally {
		lock.unlock();
		}

	}
}

class Client implements Runnable {
	private Thread thread;
	private Printer printer;
	private String letter;

	public Client(Printer printer, String letter) {
		this.printer = printer;
		this.letter = letter;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		printer.print(letter);
	}

}

public class DemoSyn {

	public static void main(String[] args) {
		Printer printer = new Printer();

		Client client = new Client(printer, "i love java");
		Client client2 = new Client(printer, "i join a new job!!");
		Client client3 = new Client(printer, "i put the paper for a job!");

	}

}
