package com.demo;
import java.sql.*;
//print all the reccords

public class DemoJdbc {

	public static void main(String[] args) {
		//		driver : type 4 (pure java)
		
		// convert ur java call to db call
		//it map jdbc datatype to SQL data type, caching
		
		//Java --------------- mysql
		//1 . load the driver, dynamic class loading
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver is loaded...");
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
