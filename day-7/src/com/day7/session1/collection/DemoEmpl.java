package com.day7.session1.collection;
import java.util.*;
//If name is same sort as per salary

class EmpSorterAsPerNameThenAsPerSalary implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		int val= o1.getName().compareTo(o2.getName());
		if(val!=0) {
			return val;
		}else {
			return Integer.compare(o2.getSalary(), o1.getSalary());
		}
	}
}


//Extra sort seq
class EmpSorterAsPerName implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().compareTo(o2.getName());
	}
}


class EmpSorterAsPerSalary implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		return Integer.compare(o2.getSalary(), o1.getSalary());
	}
}



 class Emp implements Comparable<Emp>{
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

public class DemoEmpl {

	public static void main(String[] args) {
		
		List<Emp> emps=new ArrayList<>();
		
		emps.add(new Emp(11, "raja", 2000));
		emps.add(new Emp(121, "kapil", 3000));
		emps.add(new Emp(12, "kapil", 3200));
		emps.add(new Emp(166, "ekta", 2500));
		emps.add(new Emp(71, "gunika", 4000));
		System.out.println("------original list---------");
		printEmpList(emps);
		System.out.println("------ list sortetd as per ID---------");
		Collections.sort(emps);
		printEmpList(emps);
		
		//EmpSorterAsPerName
		
		System.out.println("------ list sortetd as per Name---------");
		Collections.sort(emps, new EmpSorterAsPerName());
		printEmpList(emps);
		
		System.out.println("------ list sortetd as per Salary---------");
		Collections.sort(emps, new EmpSorterAsPerSalary());
		printEmpList(emps);
		
		//EmpSorterAsPerNameThenAsPerSalary
		
		
		System.out.println("------ list sortetd as per name and as per salary---------");
		Collections.sort(emps, new EmpSorterAsPerNameThenAsPerSalary());
		printEmpList(emps);
		
		//can we use a ann inner class
		
		System.out.println("------ list sortetd as per name(ann)---------");
		Collections.sort(emps, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		printEmpList(emps);
		
	}


	private static void printEmpList(List<Emp> emps) {
		Iterator<Emp>it=emps.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}











