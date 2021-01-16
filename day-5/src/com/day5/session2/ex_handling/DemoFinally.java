package com.day5.session2.ex_handling;

import java.io.IOException;
import java.sql.SQLException;

public class DemoFinally {
	
	public static void main(String[] args) {
		
		try {
			myFunction();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	 static int myFunction() throws SQLException {
		try {
			//BL
			throw new SQLException();
		}finally {
			try {
			throw new NullPointerException();
			}catch(Exception ex) {
				
			}
		}
		
	}

}
