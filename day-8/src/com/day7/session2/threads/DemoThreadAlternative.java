package com.day7.session2.threads;

//class MyThread extends Thread{
//	@Override
//	public void run() {
//		System.out.println("job of the thread...");
//	}
//}

//
//class MyJob implements Runnable{
//	private Thread thread;
//	private String name;
//
//	public MyJob(String name) {
//		this.name = name;
//		this.thread=new Thread(this);
//		this.thread.start();
//	}
//
//	@Override
//	public void run() {
//		System.out.println("job of the thread..."+ name);
//	}
//	
//}
public class DemoThreadAlternative {

	public static void main(String[] args) {
		
//		Thread myThread=new Thread() {
//			@Override
//			public void run() {
//				System.out.println("job of the thread...");
//			}
//		};
//		myThread.start();
		
		///new MyJob("foo");
		
		
//		
//		Thread thread=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("job of the thread...");
//			}
//		});
		
//		
//		Thread thread=new Thread(()-> System.out.println("job of the thread...."));
//		
//		thread.start();
//		System.out.println("hi");
	}
}
