package com.day1.session1.ex1;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
class Emp{
	private int id;
	private String name;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
	
}
public class DemoJava8FI {

	public static void main(String[] args) {
		
		//pridate check a no is even / odd?
		Predicate<Integer> isEven= t->t%2==0?true:false;
		
		System.out.println(isEven.test(50));
			
		//predicate : a string container "raj"
		Predicate<String> isRajContain= t-> t.contains("raj");
		System.out.println(isRajContain.test("i love java"));
		
		//is Emp is getting sal > 200000
		Predicate<Emp>isHigherSalariedEmp= emp->  emp.getSalary()> 200000;
		System.out.println(isHigherSalariedEmp.test(new Emp(12	, "foo", 2000000)));
	
		
		
		//BiPredicate
		
		BiPredicate<Integer, Integer>biPredicate=( t,  u) -> t>u?true:false;
		
	
		
		/*
		 * 4 categories:
		 * Predicate
		 * 
		 * 
		 */
	}
}
