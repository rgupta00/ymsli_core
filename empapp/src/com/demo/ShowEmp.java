package com.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowEmp {
	public static void main(String[] args) {

		Statement stmt = null;
		ResultSet rs = null;
		// connection
		try (Connection connection = ConnectionFactory.getConnection()) {

			stmt=connection.createStatement();
			rs=stmt.executeQuery("select * from emp1");
			
			while (rs.next()) {
				System.out.print(rs.getInt("eid") + ":");
				System.out.print(rs.getString("ename") + ":");
				System.out.print(rs.getString("city") + ":");
				System.out.print(rs.getString("desi") + ":");
				System.out.println(rs.getInt("salary"));
			}

			System.out.println("conn is done");
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
