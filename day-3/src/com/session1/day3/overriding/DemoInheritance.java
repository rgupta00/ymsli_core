package com.session1.day3.overriding;

class Box {

	private int l, b;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Box() {
	} // GPP: providing default ctr is a gpp

	//				1	,2,
	public Box(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	public void print() {
		System.out.println("l:" + l + " b: " + b);
	}
}

class Box3D extends Box {
	private int h;

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	//		1	,2,			3,
	Box3D(int l, int b, int h) {
		super(l, b);
		this.h = h;
	}

	public void print() {
		super.print();
		System.out.println("h:" + h);
	}
}

class Box3DWithColor extends Box3D {
	private String color;

	//						1	,2,			3,	"red"
	public Box3DWithColor(int l, int b, int h, String color) {
		super(l, b, h);
		this.color = color;
	}

	public void print() {
		super.print();
		System.out.println("Color:" + color);
	}
}

public class DemoInheritance {

	public static void main(String[] args) {

		Box3DWithColor box=new Box3DWithColor(1,2,3,"red");
		box.print();
			
	}
}
