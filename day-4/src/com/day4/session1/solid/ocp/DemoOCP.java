package com.day4.session1.solid.ocp;

import java.awt.font.ShapeGraphicAttribute;

//
interface Shape {
	public void printShape();
}

class Circle implements Shape {
	public void printShape() {
		System.out.println("printing a circle....");
	}
}


class SemiCircle implements Shape {
	public void printShape() {
		System.out.println("printing a semi circle....");
	}
}

class Triangle implements Shape {
	public void printShape() {
		System.out.println("printing a Tri....");
	}
}

class Sqare implements Shape {
	public void printShape() {
		System.out.println("printing a Square....");
	}
}

class ShapeProcessor {
	//open for extension : close for modification 
	public final static void processShape(Shape shape) {
		shape.printShape();
	}
	
}

public class DemoOCP {

	public static void main(String[] args) {
		Shape shape=new SemiCircle();
		ShapeProcessor.processShape(shape);

	}

}
