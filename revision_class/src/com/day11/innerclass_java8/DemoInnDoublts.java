package com.day11.innerclass_java8;

import com.day11.innerclass_java8.Foof.Boof;
//static inner class : singleton DP : static holder pattern
class Foof {
	private int i=90;
	
	 class Boof{
		private int j=60;
		
		void boof() {
			System.out.println(i);
		}
	}
	public void foof() {
		Boof boof =new Boof();
		System.out.println(boof.j);
	}

}
public class DemoInnDoublts {
	
	public static void main(String[] args) {
		Foof.Boof b=new Foof().new Boof();
		b.boof();
	}

}
