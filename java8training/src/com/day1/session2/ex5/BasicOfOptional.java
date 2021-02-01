package com.day1.session2.ex5;

import java.util.Optional;
import java.util.function.Supplier;
class UserNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -8103675772953133443L;
	
}
public class BasicOfOptional {

	public static void main(String[] args) {
		
		
		Optional<String> optStr=getName(44);
		
		String name=optStr.orElseGet(()->  "name is not found");
		
		System.out.println(name);
//		if(optStr.isPresent()) {
//			String value=optStr.get();
//		}else
//			System.out.println("name is not found");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static Optional<String> getName(int id) {
		return Optional.ofNullable(null);
	}
}
