package com.day10.session2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import com.demo.ConnectionFactory;

public class BatchProcesing {

	public static void main(String[] args) {
		// 10000
		Connection connection = ConnectionFactory.getConnection();

		long start = System.currentTimeMillis();
		// how to do batch proccing in jdbc?

		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into mytable(name) values (?)");

			connection.setAutoCommit(false);

			for (long i = 0; i < 10000; i++) {
				pstmt.setString(1, "foo:" + i);
				pstmt.addBatch();
				if (i % 200 == 0) {
					pstmt.executeBatch();
				}
			}
			connection.commit();
		} catch (SQLException ex) {
			ex.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken:" + (end - start));
	}
}
