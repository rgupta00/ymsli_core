package com.day10.session2;

import java.sql.*;

import com.demo.ConnectionFactory;

public class DemoACID {

	public static void main(String[] args) {

		Connection connection = ConnectionFactory.getConnection();
		
		
		try {
			//I
			connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
			connection.setAutoCommit(false);// hey jdbc i want to take control of ACID prop
			
			PreparedStatement pstmt = connection.prepareStatement
					("update account set balance=balance-10 where id=?");
			pstmt.setInt(1, 1);
			pstmt.executeUpdate();

			pstmt = connection.prepareStatement("update account set balance=balance+10 where id=?");
			pstmt.setInt(1, 2);
			pstmt.executeUpdate();
			
			connection.commit();
			
			System.out.println("----done--------");
		} catch (SQLException ex) {
			ex.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// A B
		// 100 100
		// 90 110

		/*
		 * RDBMS:
		 * 
		 * A: atomicity C: consistency I: isolation D: durability
		 * 
		 */
	}

}
