package day8_design_pattern.creational.builder;

public class FoodBuilder {
	private String name;
	private int unit;
	private int vitC=500;
	private int vitA=600;
	private int vitB12=2000;
	private int vitB5=3000;
	private int vitD=60000;

	public FoodBuilder(String name, int unit) {
		this.name = name;
		this.unit = unit;
	}

	public Food getFood() {
		return new Food(name, unit, vitC, vitA, vitB12, vitB5, vitD);
	}

	public FoodBuilder setVitC(int vitC) {
		this.vitC = vitC;
		return this;
	}

	public FoodBuilder setVitA(int vitA) {
		this.vitA = vitA;
		return this;
	}

	public FoodBuilder setVitB12(int vitB12) {
		this.vitB12 = vitB12;
		return this;
	}

	public FoodBuilder setVitB5(int vitB5) {
		this.vitB5 = vitB5;
		return this;
	}

	public FoodBuilder setVitD(int vitD) {
		this.vitD = vitD;
		return this;
	}
	
	
	
}
