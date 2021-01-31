package com.day1.session2.ex4;
import java.util.*;
import java.util.function.Supplier;
class NameNotFoundExcption extends RuntimeException{
	
}
class EmpApp{
	static public Optional<String> findEmpName(int id) {
		return Optional.ofNullable("raj");
	}
}
public class DemoOptional {
	public static void main(String[] args) {
		
		
		Optional<String> opName=Optional.ofNullable(null);
		System.out.println(opName.orElseThrow(()->  new NameNotFoundExcption()));
		
	}

}
