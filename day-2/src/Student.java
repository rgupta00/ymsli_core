
public class Student {
	private int id;
	private String name;
	private static String schoolName = "bvb";
	// init block
	static {
		schoolName = "abc";
		System.out.println("static code inside student class");
	}

	{
		System.out.println("it is a common code");
	}

	public Student() {
		System.out.println("its a default ctr");
	}

	public Student(int id, String name) {
		System.out.println("its a para ctr");
		this.id = id;
		this.name = name;
	}

	public void printStudentDetails() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("schoolName:" + schoolName);

	}
}