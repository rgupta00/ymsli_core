package com.day5.session2.ex_handling;

import java.sql.SQLException;

public class DemoStackTrace {

	public static void main(String[] args) throws SQLException {
		foof();
	}

	private static void foof() throws SQLException {
		boof();
	}

	private static void boof() throws SQLException {
		zoom();
	}

	private static void zoom() throws SQLException {
		if(1==1)
			throw new SQLException();
	}
}
