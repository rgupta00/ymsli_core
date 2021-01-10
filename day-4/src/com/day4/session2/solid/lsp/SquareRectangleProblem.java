package com.day4.session2.solid.lsp;
class Rectangle {
	private int l, b;

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

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
	
	public int getArea() {
		return l*b;
	}
	
}

//favor composition over inheritance: in case of code -resuablity

//class Square extends Rectangle{
//	
//	private int l;
//	
//	public Square(int l) {
//		super(l, l);
//	}
//	
//	public int getArea() {
//		return super.getArea();
//	}
//}

class Square{
	private Rectangle rectangle;
	
	public Square(int l) {
		rectangle=new Rectangle(l, l);
	}
	
	public void changeDimension(int l) {
		rectangle.setB(l);
		rectangle.setL(l);
	}
	
	public int getArea() {
		return rectangle.getArea();
	}
}



public class SquareRectangleProblem {
	
	public static void main(String[] args) {
		Square square=new Square(5);
	
		System.out.println(square.getArea());
		
		
		square.changeDimension(7);
		
		System.out.println(square.getArea());
		
	}

}
