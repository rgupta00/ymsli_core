package com.day7.session2.threads.pc;
//p and c?

class Q {
	private int n;

	public synchronized int get() {
		System.out.println("got: " + n);
		return n;
	}

	public synchronized void put(int n) {
		this.n = n;
		System.out.println("Put: " + n);
	}
}

class Consumer implements Runnable{
	private Q q;
	public Consumer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		while(true) {
			q.get();
		}
	}	
}

class Producer implements Runnable{
	private Q q;
	public Producer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}	
}


public class DemoPC {
	public static void main(String[] args) {

		Q q=new Q();
		Producer producer=new Producer(q);
		Consumer consumer=new Consumer(q);
		
		
	}
}
