package com.session1.day3.ex1;

public class Employee {
	private int eid;
	private String ename;
	private double salary;

	private Parking parking;

	public Employee(int eid, String ename, double salary, int pid, String loc) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.parking = parking;
		parking=new Parking(pid, loc);
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public void printEmployee() {
		System.out.println("eid: "+ eid+ " name : "+ ename +" salary "+ salary);
		parking.printParking();
	}
}
