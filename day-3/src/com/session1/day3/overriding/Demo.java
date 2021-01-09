package com.session1.day3.overriding;

import java.util.Scanner;

/*
 * Polymorphism? run time poly....
 */
abstract class Shape{
	
	private String color;

	public Shape(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public abstract void area();
}
class Triangle extends Shape{
	
	public Triangle(String color) {
		super(color);
	}

	public void area() {
		System.out.println("area of tr...."+getColor());
	}
}

class Rectangle extends Shape{
	
	public Rectangle(String color) {
		super(color);
	}

	public void area() {
		System.out.println("area of Rectangle...."+getColor());
	}
}

class Circle extends Shape{
	
	public Circle(String color) {
		super(color);
	}

	public void area() {
		System.out.println("area of ci...."+ getColor());
	}
}

public class Demo {
	
	public static void main(String ...args) {
		Scanner scanner=new Scanner(System.in);
		Shape shape=null;
		System.out.println("PE 1. for Tr 2. for Circle 3.Rectangle ");
		int choice= scanner.nextInt();
		if(choice==1)
			shape=new Triangle("red");
		else if (choice==2) {
			shape=new Circle("red");
		}
		else if (choice==3) {
			shape=new Rectangle("red");
		}
		
		if(shape!=null)
		shape.area();
		else
			System.out.println("get away from my sw!");
		
	}

}



