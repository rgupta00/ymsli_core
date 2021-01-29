package com.empapp.model.dao;

import java.sql.*;
import java.util.*;

import com.empapp.model.exceptions.DataAccessException;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection connection;

	public EmployeeDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Employee> getAllEmployees()throws DataAccessException {
		System.out.println("some jdbc code");
		// i need to hit the db and get all records and convert each record into a java
		// object
		// and then put all of them into a collection and retrun that collection
		List<Employee> employees = new ArrayList<>();
		Employee employee = null;
	
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp1");
			// i need to convert that tuple manually ( :( ) and put into a java object

			while (rs.next()) {
				employee = new Employee(rs.getInt("eid"), rs.getString("ename"), rs.getString("city"),
						rs.getString("desi"), rs.getInt("salary"));
				employees.add(employee);
			}
		}catch(SQLException ex) {
			throw new DataAccessException(ex.getMessage());
		}
		

		return employees;
	}

	@Override
	public void addEmployee(Employee employee) {

		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement("insert into emp1(ename, city, desi, salary) values (?,?,?,?)");
			pstmt.setString(1, employee.getEname());
			pstmt.setString(2, employee.getCity());
			pstmt.setString(3, employee.getDesi());
			pstmt.setInt(4, employee.getSalary());
			int no = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateEmployee(int eid, Employee employee) {
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement("update emp1 set salary = ?  where eid=?");
			pstmt.setInt(1, employee.getSalary());
			pstmt.setInt(2, eid);

			int no = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmployee(int eid) {
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement("delete from emp1 where eid=?");
			pstmt.setInt(1, eid);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Employee getEmployeeById(int eid) {
		PreparedStatement pstmt;
		Employee employee=null;
		try {
			pstmt = connection.prepareStatement("select * from emp1 where eid=?");
			pstmt.setInt(1, eid);

			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				employee=new Employee
						(rs.getInt("eid"), 
						rs.getString("ename"),
						rs.getString("city"),
						rs.getString("desi"), 
						rs.getInt("salary")); 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

}
