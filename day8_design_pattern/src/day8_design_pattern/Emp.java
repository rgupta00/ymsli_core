package day8_design_pattern;

import java.io.Serializable;

public class Emp implements Comparable<Emp>, Serializable{
	 
	private static final long serialVersionUID = 6330846922540215709L;
	private int id;
	private String name;
	private int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Emp(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Emp() {}
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
	
	@Override
	public int compareTo(Emp e) {
		return Integer.compare(this.getId(), e.getId());
	}

}