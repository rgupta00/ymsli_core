package com.day10.session2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.ConnectionFactory;

public class JdbcFetchSize2 {

	public static void main(String[] args) throws SQLException {
		ResultSet rs = null;
		
		long start = System.currentTimeMillis();
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement stmt = connection.prepareStatement("select * from mytable");
		//10
		//stmt.setFetchSize(500);
		rs = stmt.executeQuery();
		while (rs.next()) {

		}
		long end = System.currentTimeMillis();
		System.out.println("time taken:" + (end - start));
	}

}
