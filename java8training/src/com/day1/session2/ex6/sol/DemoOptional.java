package com.day1.session2.ex6.sol;

import java.util.Optional;

/*
 * 		may have a	 may hv ins		but must have name
 * Person -----> Car---> Insurance--> name
 */

class InsuranceNameNotFoundException extends RuntimeException{}
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
	private Optional<Insurance> insurance;

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}

	
	
}
class Person{
	private Optional<Car> car;

	public Optional<Car> getCar() {
		return car;
	}

	public void setCar(Optional<Car> car) {
		this.car = car;
	}

	
	
}
public class DemoOptional {

	public static void main(String[] args) {
		
		Insurance insurance=null;
		
		Car car=new Car();
		
		Person person=new Person();
		
		Optional<Insurance>optIns=Optional.ofNullable(insurance);
		
		Optional<Car>opCar=Optional.ofNullable(car);
		
		car.setInsurance(optIns);
		
		person.setCar(opCar);
	
		Optional<Person>oPperson=Optional.ofNullable(person);
		
		String name=printInsCompanyName(oPperson);
		System.out.println(name);
		
	}

	private static String printInsCompanyName(Optional<Person> opPerson) {
		
	
				return  opPerson
				 .flatMap(p-> p.getCar())
				 .flatMap(c-> c.getInsurance())
				 .map(ins->ins.getCompanyName())
				 .orElseThrow(()->new InsuranceNameNotFoundException());
		 
	
	}
}






