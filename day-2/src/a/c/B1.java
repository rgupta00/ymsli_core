package a.c;
import a.b.*;

public class B1 extends A1{
	
	public static void main(String[] args) {
		B1 a=new B1();
		a.fooPublic();
		System.out.println(a.id);
	}
}
