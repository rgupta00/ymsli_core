package com.day2.session2.callbyref;

class Data {
	private int val;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Data(int val) {
		this.val = val;
	}

}

public class DemoCallByRef {

	public static void main(String[] args) {
		
		Data d1=new Data(44);
		System.out.println("before calling change me methnod :" + d1.getVal());
		myFuncation(d1);
		System.out.println("before calling change me methnod :" + d1.getVal());
	}

	//we are reciving the copy of the ref!
	 static void myFuncation(final Data d1) {
		d1.setVal(999);
	}
}