package com.empapp.model.dao;
//DTO or POJO: plain old java object
//Entity vs DTO*
public class Employee {
	private int eid;
	private String ename;
	private String city;
	private String desi;
	private int salary;

	public Employee() {}
	public Employee(String ename, String city, String desi, int salary) {
		this.ename = ename;
		this.city = city;
		this.desi = desi;
		this.salary = salary;
	}
	public Employee(int eid, String ename, String city, String desi, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.desi = desi;
		this.salary = salary;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesi() {
		return desi;
	}
	public void setDesi(String desi) {
		this.desi = desi;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [eid=");
		builder.append(eid);
		builder.append(", ename=");
		builder.append(ename);
		builder.append(", city=");
		builder.append(city);
		builder.append(", desi=");
		builder.append(desi);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
}
