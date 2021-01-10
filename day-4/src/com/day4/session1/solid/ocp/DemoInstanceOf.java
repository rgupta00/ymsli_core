package com.day4.session1.solid.ocp;

class Animal {
	void sound() {
		System.out.println("how it sound dont know");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("meou...");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("bho hho...");
	}

	void nightWatchManShip() {
		System.out.println("seucre home...");
	}

}

public class DemoInstanceOf {

	public static void main(String[] args) {

		Animal[] animals = { new Cat(), new Dog(), new Dog(), new Cat() };

		for(Animal animal: animals) {
			animal.sound();
			if(animal instanceof Dog)
			((Dog) animal).nightWatchManShip();
		}
		// typecasting vs instaceOf
		// compile time run time

	}

}
