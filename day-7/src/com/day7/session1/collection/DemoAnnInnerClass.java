package com.day7.session1.collection;

interface Cookable{
	public void cook();
}

public class DemoAnnInnerClass {

	public static void main(String[] args) {
		//Hey java imp cookable at run time create a class (i dnot care about the name of the
		//class ) (hence we can not ctr inside ann inner class )
		Cookable cookable=new Cookable() {
			
			@Override
			public void cook() {
				System.out.println("cooking i hate it ... ");
			}
		};
		
		//passing ann inn class to a method call .. .YES
		myFoo(new Cookable() {
			
			@Override
			public void cook() {
				
			}
		});
		
	}
	
	public static void myFoo(Cookable cookable) {
		cookable.cook();
	}
}




