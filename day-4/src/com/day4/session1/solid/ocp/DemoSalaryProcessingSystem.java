package com.day4.session1.solid.ocp;
interface Payable{
	public double getPayment();
}
class Employee implements Payable{
	public double getPayment() {
		return 456454545.88;
	}
}

class Freelance implements Payable{
	public double getPayment() {
		return 456454545.88;
	}
}

class PaymentProcessingSystem{
	//OCP
	public void processPayment(Payable e) {
		e.getPayment();
	}
}
public class DemoSalaryProcessingSystem {
	
	public static void main(String[] args) {
		
	}
}
