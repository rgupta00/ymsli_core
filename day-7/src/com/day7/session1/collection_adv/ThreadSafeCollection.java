package com.day7.session1.collection_adv;
import java.util.*;
class Student{
	private int id;
	private String name;
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
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}

class ProcessStudent{
	
	public static List<Student> defaulterStudent(){
		// better not to return null , u can return an empty arraylist
		//when person iterate nothing is going to printed on the screen
		return Collections.emptyList();
	}
}
class School{
	private String schoolName;
	private List<Student> students=new ArrayList<>();
	
	public String getSchoolName() {
		return schoolName;
	}
	public List<Student> getStudents() {
		//it will return an un modifiable clone
		//b
		return Collections.unmodifiableList(students);
	}
	
	public void printDetails() {
		System.out.println("school name: "+ schoolName);
		for(Student student: students)
			System.out.println(student);
	}
	public School(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
}
public class ThreadSafeCollection {
	
	public static void main(String[] args) {
		
		School school=new School("BVB");
		school.addStudent(new Student(121, "gun"));
		school.addStudent(new Student(11, "kesh"));
	
		
		List<Student> list=school.getStudents();
		list.clear();
		
		school.printDetails();
		
		//how to create a thread safe arraylist, LL
		//thread safe : t1 t2
		//* will discuss thread : next
		///List<String> list=Collections.synchronizedList(new ArrayList<>());
		
		
	}

}
