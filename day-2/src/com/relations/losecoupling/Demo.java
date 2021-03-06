package com.relations.losecoupling;

interface Vehical {
	public abstract void move(String s, String d);
}

class Metro implements Vehical {
	public void move(String s, String d) {
		System.out.println("metro is moving form " + s + " to " + d);
	}
}

class Car implements Vehical {
	public void move(String s, String d) {
		System.out.println("car is moving form " + s + " to " + d);
	}
}

class Bike implements Vehical {
	public void move(String s, String d) {
		System.out.println("bike is moving form " + s + " to " + d);
	}
}

class Passanger {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d, Vehical vehical) {
		System.out.println("passanger named " + name + " is traveling");
		vehical.move(s, d);
	}
}

public class Demo {

	public static void main(String[] args) {

		Vehical vehical = new Metro();

		Passanger passanger = new Passanger("rajesh");
		passanger.travel("PV", "EM", vehical);

	}

}
