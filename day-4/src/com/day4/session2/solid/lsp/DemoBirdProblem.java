package com.day4.session2.solid.lsp;

//seprate what varies

class Bird{
	public  void eat() {
		System.out.println("eating....");
	}
}

interface Swimable {
	public void swim();
}
interface Flyable{
	public void fly() ;
}

class Eagle extends Bird implements Flyable{
	public void fly() {
		System.out.println("fly like champion");
	}
}

class Duck extends Bird implements Swimable{
	public void swim() {
		System.out.println("swim like champion");
	}
}

class Emu extends Bird{
	public  void eat() {
		System.out.println("eating.fast...");
	}
}

public class DemoBirdProblem {

	public static void main(String[] args) {
		
		Eagle eagle=new Eagle();
		eagle.fly();
	
		Emu emu=new Emu();
		emu.eat();
	}
}





