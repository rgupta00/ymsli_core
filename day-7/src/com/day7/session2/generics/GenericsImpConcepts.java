package com.day7.session2.generics;
/*
 * lets say: hotel : glass that hold any thing that is liquid and drinkable
 */

interface Drinkable{
}

interface Flowable{
}
class Water implements Drinkable, Flowable{	
}

class Wine implements Drinkable, Flowable{
}

class Juice implements Drinkable, Flowable{	
}
class Petrol implements Flowable{	
}

class Cake{
}


class Glass<T extends Drinkable & Flowable>{
	private T liquid;

	public T getLiquid() {
		return liquid;
	}

	public void setLiquid(T liquid) {
		this.liquid = liquid;
	}
	
}
public class GenericsImpConcepts {
	
	public static void main(String[] args) {
		Petrol petrol=new Petrol();

		
	}
	

}




