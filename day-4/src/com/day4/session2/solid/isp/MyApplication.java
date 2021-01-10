package com.day4.session2.solid.isp;

public class MyApplication {
	
	private ApiV1 api;
	public MyApplication() {
		this.api=new OldApi();
		
	}
	
	public void doWork() {
		api.logic1();
	}
}
