package com.day1.session2.ex6;

import java.util.Optional;

/*
 * 		may have a	 may hv ins		but must have name
 * Person -----> Car---> Insurance--> name
 */
class Insurance{
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
class Car {
	private Insurance insurance;

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	
}
class Person{
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
public class DemoOptional {

	public static void main(String[] args) {
		
		Insurance insurance=new Insurance();
		insurance.setCompanyName("sunlife");
		
		Car car=new Car();
		car.setInsurance(insurance);
		
		Person person=new Person();
		person.setCar(car);
		
		String inName=printInsCompanyName(person);
		
	}

	private static String printInsCompanyName(Person person) {
		return null;
	}
}






