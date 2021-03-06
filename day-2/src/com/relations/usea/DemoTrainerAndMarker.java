package com.relations.usea;

class Marker {
	private String color;
	private String brand;
	private String price;

	public Marker(String color, String brand, String price) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	public void printMarkerDetails() {
		System.out.println("color: " + color);
		System.out.println("brand: " + brand);
		System.out.println("price: " + price);

	}

	public void writeWithMaker() {
		System.out.println("writing with marker of color " + color);
	}
}

class Trainer {
	private String name;
	private String qualification;
	private int rating;

	public Trainer(String name, String qualification, int rating) {
		this.name = name;
		this.qualification = qualification;
		this.rating = rating;
	}

	// trainer while teaching use marker ..
	public void teaching(Marker marker) {
		// method deligation in oo
		marker.writeWithMaker();
	}

	public String getName() {
		return name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}

public class DemoTrainerAndMarker {

	public static void main(String[] args) {

		Marker marker = new Marker("blue", "Ry", "40");

		Trainer trainer = new Trainer("raj", "MTech", 10);
		trainer.teaching(marker);

	}

}
