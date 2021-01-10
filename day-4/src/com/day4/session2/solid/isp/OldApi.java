package com.day4.session2.solid.isp;

public class OldApi implements ApiV1 , ApiV2{
	public void logic1() {
		System.out.println("logic1 of oldApi");
	}
	public void logic2() {
		System.out.println("logic2 of oldApi");
	}
	
	public void logic3() {
		System.out.println("logic3 of oldApi");
	}
	public void logic4() {
		System.out.println("logic4 of oldApi");
	}
	
}
