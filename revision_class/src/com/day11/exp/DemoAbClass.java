package com.day11.exp;

import java.util.Scanner;

abstract class Shape{
	private String color;
	public Shape(String color) {
		this.color=color;
	}
	public abstract void calArea();
	
	public void showColor() {
		System.out.println(color);
	}
}


class Circle extends Shape{

	public Circle(String color) {
		super(color);
	}

	@Override
	public void calArea() {
		System.out.println("area:pi r r");
	}
}

class Triangle extends Shape{

	public Triangle(String color) {
		super(color);
	}

	@Override
	public void calArea() {
		System.out.println("area:1/2 lXb");
	}
}

class Rectangle extends Shape{

	public Rectangle(String color) {
		super(color);
	}

	@Override
	public void calArea() {
		System.out.println("area:lXb");
	}
}
public class DemoAbClass {

	public static void main(String[] args) {
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello....");
			}
		};
		
		

		Runnable runnable2=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello....");
			}
		};
		
		System.out.println(runnable.getClass().hashCode());
		System.out.println(runnable2.getClass().hashCode());
		
		
		//Run time poly:
		Shape shape=null;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE ur choice 1. Tr, 2.Sq 3.Cir");
		int choice=scanner.nextInt();
		if(choice==1) {
			shape=new Triangle("red");
			shape.calArea();
		}else if(choice==2) {
			shape=new Triangle("red");
			shape.calArea();
		}else if(choice==3) {
			shape=new Circle("red");
			shape.calArea();
		}else {
			System.out.println("wrong choice");
		}
	}
}














