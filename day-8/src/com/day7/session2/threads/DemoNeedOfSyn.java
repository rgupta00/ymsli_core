package com.day7.session2.threads;

class Printer {

	private Object lock=new Object();
	
	public  void print(String message) {

		//
		//
		synchronized (lock) {
			System.out.print("[" + message);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			System.out.println("]");
		}
		

		//
		//

	}
}

class Client implements Runnable {
	private Printer printer;
	private Thread thread;
	private String message;

	public Client(Printer printer, String message) {
		this.printer = printer;
		this.message = message;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@Override
	public void run() {
		printer.print(message);
	}

}

public class DemoNeedOfSyn {

	public static void main(String[] args) {
		Printer printer = new Printer();
		Client raj = new Client(printer, "i love java");
		Client sumit = new Client(printer, "i %^%$% java");
		Client amit = new Client(printer, "i love traveling");

	}

}
