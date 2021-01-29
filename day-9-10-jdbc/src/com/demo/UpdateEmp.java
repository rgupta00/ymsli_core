package com.demo;
import java.sql.*;

public class UpdateEmp {

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
					("update emp1 set salary = ?  where eid=?");
			pstmt.setInt(2, 4);
			pstmt.setInt(1, 43);

			
			int no = pstmt.executeUpdate();
			
			System.out.println(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}







