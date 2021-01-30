package com.day11.innerclass_java8;

/*
 * Java 8 : delearative data processing	=> Funcational programming approach 1960
 * 		Java collection :(
 * 	FP= immutablity(thread safe) + higher order functional +currying + extra topics
 * C: logic 
 * OOPs: No good way to handle declarive data processing :(
 * 
 * Collection api older
 * Collection api new DDP
 * 
 *  delearative data processing	 ==> lambda ==> Funcation inface
 *  	Interface evaluation!
 * 				List
 * 
 * 	AL		LL			Set
 */

interface API{
	void dowork();
	default void dowork2() {
		System.out.println("....");
	}
	public static void doStatic() {
		System.out.println("hello");
	}
}
class APiImp1 implements API{

	@Override
	public void dowork() {
		
	}
	
}
class APiImp2 implements API{

	@Override
	public void dowork() {
		
	}
	
}


public class DemoAnn {
	
	public static void main(String[] args) {
		API.doStatic();
	}

}







