package com.day11.innerclass_java8;

import java.awt.print.Book;
import java.util.*;

/*
 * 1. top level inner clas
 * 2. method local inner class
 * 3. ann inner class
 * 
 */
//i have used it while create custom iterator dp
class Product {
	private int id;
	private String name;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {
	}

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}



//Iterator and Iterable
// creating my link list in java

//class LL{
//	public void foof() {
//		System.out.println("foof method...");
//	}
//	class Node extends LL{
//		@Override
//		public void foof() {
//			System.out.println("foof method overriden");
//		}
//	}
//}

//
//class ProductStore implements Iterable<Product>{
//	private String productStoreName;
//	private List<Product> products;
//	public ProductStore(String productStoreName) {
//		this.productStoreName = productStoreName;
//		this.products=new ArrayList<>();
//	}
//	
//	public void addProduct(Product product) {
//		products.add(product);
//	}
//
//	@Override
//	public Iterator<Product> iterator() {
//		return new ProductIterator();
//	}
//
//	class ProductIterator implements Iterator<Product>{
//
//		@Override
//		public boolean hasNext() {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public Product next() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//	}
//}
class Outer {
	private int i = 999;

	class Inner {
		private int i = 99;

		public void doInner() {
			System.out.println(Outer.this.i);
		}
	}

	public void doOuter() {
		Inner inner = new Inner();
		inner.doInner();
	}
}

public class DemoInn {

	public static void main(String[] args) {
		

//		Outer outer=new Outer();
//		outer.doOuter();
	}
}
