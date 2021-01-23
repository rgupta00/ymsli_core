package com.day7.session1.doubts;

import java.io.IOException;
import java.sql.SQLException;


public class FooClient {

	public static void main(String[] args)  {
		
		try {
			Foo foo=new Foo();
		} catch (Exception  e) {
			e.printStackTrace();
		}
	}
}
