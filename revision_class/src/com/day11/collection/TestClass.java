package com.day11.collection;

public class TestClass {

	private volatile Integer count = 1;
	private volatile Integer threadIdToRun = 1;
	private Object object = new Object();

	public static void main(String[] args) {

		TestClass testClass = new TestClass();
		Thread t1 = new Thread(testClass.new Printer(1));
		Thread t2 = new Thread(testClass.new Printer(2));
		Thread t3 = new Thread(testClass.new Printer(3));

		t1.start();
		t2.start();
		t3.start();
		
		//t2 t1 t3
		//t3 t1 t2
	}

	class Printer implements Runnable {

		private int threadId;

		public Printer(int threadId) {
			super();
			this.threadId = threadId;
		}

		@Override
		public void run() {
			
			//threadId=1 threadIdToRun=3
			//count=4
			//
			try {
				while (count <= 6) {
					synchronized (object) {
						if (threadId != threadIdToRun) {
							object.wait();
						} else {
							System.out.println("Thread " + threadId + " printed " + count);
							count += 1;

							if (threadId == 1)
								threadIdToRun = 2;
							else if (threadId == 2)
								threadIdToRun = 3;
							else if (threadId == 3)
								threadIdToRun = 1;

							object.notifyAll();
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}