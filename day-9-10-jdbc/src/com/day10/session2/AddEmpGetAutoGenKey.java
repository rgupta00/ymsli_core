package com.day10.session2;
import java.sql.*;

public class AddEmpGetAutoGenKey {

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
			
			String addEmpQuery="insert into emp1(ename, city, desi, salary) values (?,?,?,?)";
			pstmt=connection.prepareStatement
					(addEmpQuery, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "amit");
			pstmt.setString(2, "banglore");
			pstmt.setString(3, "IT");
			pstmt.setInt(4, 56);
			int no = pstmt.executeUpdate();
			//?
			System.out.println("hey customer it is you id ...");
			ResultSet rs=pstmt.getGeneratedKeys();
			if(rs.next()) {
				System.out.println(rs.getInt(1));
			}
			System.out.println(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}







