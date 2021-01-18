package com.day6.session1.io_serilization;

//how to make own decorator
interface Greet {
	public String greet();
}

class SimpleGreeter implements Greet {
	@Override
	public String greet() {
		return "good morning";
	}
}

class SpecialGreeter implements Greet {

	private Greet greet;

	public SpecialGreeter(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String greet() {
		return "special day " + greet.greet();
	}
}

class NewYearSpecialGreeter implements Greet {

	private Greet greet;

	public NewYearSpecialGreeter(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String greet() {
		return "New year 2021 " + greet.greet();
	}
}

public class DemoDecorartor {

	public static void main(String[] args) {

		NewYearSpecialGreeter newYearSpecialGreeter=
				new NewYearSpecialGreeter(new SpecialGreeter(new SimpleGreeter()));
		System.out.println(newYearSpecialGreeter.greet());
		
	}
}



