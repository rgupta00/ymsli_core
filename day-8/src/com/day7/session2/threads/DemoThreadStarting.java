package com.day7.session2.threads;

class MyJob implements Runnable{
	private Thread thread;
	public MyJob() {
		thread=new Thread(this);
		thread.start();
	}


	@Override
	public void run() {
		System.out.println("job of the thread....");
	}
	
}
public class DemoThreadStarting {
	
	public static void main(String[] args) {
		MyJob job=new MyJob();
		
		
	}

}
