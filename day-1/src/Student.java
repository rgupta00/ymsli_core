//BL: id, name can not be change after st reg!
//grade can be only based on marks obtai... 
public class Student {
	private int id;
	private String name;
	private int marks;
	private String grade;
	
	
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	
	
}
