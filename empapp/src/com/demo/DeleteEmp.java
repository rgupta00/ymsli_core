package com.demo;
import java.sql.*;

public class DeleteEmp {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement pstmt=null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded...");
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		try {
			connection= DriverManager.getConnection
					("jdbc:mysql://localhost:3306/yms_demo?useSSL=false","root","root");
			
			pstmt=connection.prepareStatement
					("delete from emp1 where eid=?");
			pstmt.setInt(1, 8);
			
			int no = pstmt.executeUpdate();
			
			System.out.println(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}







