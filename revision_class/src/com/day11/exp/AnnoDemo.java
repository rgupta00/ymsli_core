package com.day11.exp;


//What is custom annotation?
//how to apply the app

@MyAnno
class AnnoClient{
	
	private double rank;
	
	@MyAnno(foof = "YMS freshers are champs still miles to go", 
			isDone = true, myArr = {"MCA","BTech","ME"})
	void foo() {
		System.out.println("foo of A");
	}
}

public class AnnoDemo {

	
	public static void main(String[] args) {
		//java relfection, u can also do annotation processing
	}
}











