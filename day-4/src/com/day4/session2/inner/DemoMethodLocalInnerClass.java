package com.day4.session2.inner;

class Foof {
	
	
	void foofMethod() {
		//a method local inner class can not access local variable of the method 
		// untill it is not declared "final"
		int i = 9;// effectively final :
		class Boof {
			void boofMethod() {
				System.out.println("boof method of Boof...."+i);
			}
		}
		Boof boof=new Boof();
		boof.boofMethod();
		
	}

}

public class DemoMethodLocalInnerClass {

	public static void main(String[] args) {

	}

}
