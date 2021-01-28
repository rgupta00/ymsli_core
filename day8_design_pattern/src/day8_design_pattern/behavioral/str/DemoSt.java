package day8_design_pattern.behavioral.str;
//what str desgin pattern do?

// it help us to make more maintainable sw 
//it replace inh with composition

//seprate what varies
interface Swimmable {
	public void swim();
}

interface Flyable {
	public void fly();
}

class LitterFlyer implements Flyable {

	@Override
	public void fly() {
		System.out.println("very less flly...");
	}

}

class HeavyFlyer implements Flyable {

	@Override
	public void fly() {
		System.out.println("heavy fly...");
	}

}

class ChampFlyer implements Flyable {

	@Override
	public void fly() {
		System.out.println("Champ fly...");
	}

}

class LitterSwimmer implements Swimmable {

	@Override
	public void swim() {
		System.out.println("very less swimer...");
	}

}

class HeavySwimmer implements Swimmable {

	@Override
	public void swim() {
		System.out.println("heavy swimer...");
	}

}

class ChampSwimmer implements Swimmable {
	@Override
	public void swim() {
		System.out.println("Champ swimer...");
	}

}

class Duck {
	private Flyable flyable;
	private Swimmable swimmable;

	public Duck() {
		flyable=new LitterFlyer();
		swimmable=new LitterSwimmer();
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public void setSwimmable(Swimmable swimmable) {
		this.swimmable = swimmable;
	}

	public void printDetails() {
		System.out.println("eating by duck");
		flyable.fly();
		swimmable.swim();
	}
}

public class DemoSt {

	public static void main(String[] args) {
		Duck mallarDuck=new Duck();
		mallarDuck.setFlyable(new ChampFlyer());
		mallarDuck.printDetails();
	}
}
