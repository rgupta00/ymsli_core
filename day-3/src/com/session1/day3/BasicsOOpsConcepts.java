package com.session1.day3;
import java.util.*;
abstract class Vehical {
	public abstract void move(String s, String d) ;
}
class Metro extends Vehical{
	public void move(String s, String d) {
		System.out.println("moving from "+ s+" to "+ d +" using metro...");
	}
}
class Car extends Vehical{
	public void move(String s, String d) {
		System.out.println("moving from "+ s+" to "+ d +" using car...");
	}
}
class Bike extends Vehical{
	public void move(String s, String d) {
		System.out.println("moving from "+ s+" to "+ d +" using bike...");
	}
}
class Passanger{
	
	private String name;

	public Passanger(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void travel(String s, String d, Vehical vehical) {
		System.out.println(name);
		vehical.move(s, d);
	}
	
}
public class BasicsOOpsConcepts {

	public static void main(String[] args) {
		
		
		//Car car =new Car();// dont support polymorphism, and loose coupling
		Vehical vehical=new Bike();
		
		Passanger passanger=new Passanger("ravi");
		passanger.travel("PV", "Noida", vehical);
	}
}
