package com.demo;
import java.sql.*;

public class AddEmp {

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
					("insert into emp1(ename, city, desi, salary) values (?,?,?,?)");
			pstmt.setString(1, "indu");
			pstmt.setString(2, "banglore");
			pstmt.setString(3, "IT");
			pstmt.setInt(4, 56);
			int no = pstmt.executeUpdate();
			
			System.out.println(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}







