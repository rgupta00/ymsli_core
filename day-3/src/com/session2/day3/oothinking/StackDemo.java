package com.session2.day3.oothinking;

//memory leak

class Foo{
	static int i=1;
	public void foof() {
		
		
	}
}
class Product {
	private int id;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(int id, double price) {
		this.id = id;
		this.price = price;
	}

	public Product() {
	}

	public void print() {
		System.out.println("product id: " + id + " price : " + price);
	}

}

class Stack {
	private int SIZE = 10;
	private Product x[];
	private int top;

	public Stack() {
		x = new Product[SIZE];
		top = -1;// empty stack
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(Product val) {
		if (isFull()) {
			System.out.println("stack is full...");
		}
		x[++top] = val;
	}

	public Product pop() {
		if (isEmpty()) {
			System.out.println("stack is Empty...");
			return null;
		}
		return x[top--];
	}
}

public class StackDemo {

	public static void main(String[] args) {

		Stack stack = new Stack();
		// System.out.println(stack.pop());
		stack.push(new Product(121, 78));
		stack.push(new Product(12, 780));
		stack.push(new Product(1291, 178));

		stack.push(new Product(1771, 7998));

		stack.push(new Product(1, 23));
		stack.push(new Product(1121, 7890));


		// stack.pop() will return an product --> on that product we are calling the print me
		stack.pop().print();
		stack.pop().print();
		stack.pop().print();
		
		stack.pop().print();
		stack.pop().print();
		stack.pop().print();
		
	}
}
