package day8_design_pattern;
import java.util.*;
class A{
	void foo() {
		System.out.println("foo of A");
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Deprecated
	void oldApi() {
		List list=new ArrayList();
		list.add("foo");
		System.out.println("old api 2009");
	}
	
	void newApi() {
		System.out.println("old api 2020");
	}
	
}

class B extends A{
	@Override
	void foo() {
		System.out.println("foo of B");
	}
	
}

public class DemoAnnotation {
	
	public static void main(String[] args) {
		A a=new A();
		a.oldApi();
		
		//annoatation :aka meta data
		//inbuild
		//user defined
	}

}
