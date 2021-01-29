package com.day10.session2;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
public class DemoGetConnDiffSy {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex) {}
		Properties prop=new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		prop.setProperty("useSSL", "false");
		
		try {
			//Connection connection=DriverManager.getConnection(url)
			//Connection connection=DriverManager.getConnection(url, Properties)
			//Connection connection=DriverManager.getConnection(url, user, password)
			
			//jdbc:mysql://localhost/test?" + "user=minty&password=greatsqldb"
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/yms_demo?user=root&password=root");
		
			Scanner scanner=new Scanner(System.in);
			String query=scanner.nextLine();
			Statement smt=connection.createStatement();
			boolean stauts = smt.execute(query);
			
			// if stauts is true that means it is select kind of query
			
			if(stauts) {
				//look for rs
				ResultSet rs=smt.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getString("title"));
				}
			}else {
				int noOfRows= smt.getUpdateCount();// featch how many tuples are effected by query
				System.out.println(noOfRows);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
