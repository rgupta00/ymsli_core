package com.empapp.web.controller;
import java.sql.SQLException;
import java.util.*;

import com.empapp.model.dao.Employee;
import com.empapp.model.exceptions.DataAccessException;
import com.empapp.model.exceptions.EmployeeNotFoundException;
import com.empapp.model.service.EmployeeService;
import com.empapp.model.service.EmployeeServiceImpl;

public class DemoController {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		
		List<Employee> employees;
		try {
			employees = employeeService.getAllEmployees();
//			for(Employee employee:employees) {
//				System.out.println(employee);
//			}
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	//	System.out.println("printng by id");
//		try {
//		Employee employee=employeeService.getEmployeeById(7);
//		System.out.println(employee);
//		}catch(EmployeeNotFoundException ex) {
//			System.out.println(ex.getMessage());
//		}
		
		
//		Employee employee=new Employee("vikas", "delhi", "trainer", 50);	
//		employeeService.addEmployee(employee);
		
		//update
//		
//		Employee employee=employeeService.getEmployeeById(3);
//		employee.setSalary(employee.getSalary()+10);
//		employeeService.updateEmployee(3, employee);
//		System.out.println("salary updated..");
		
		//del: soft delete vs hard del
		employeeService.deleteEmployee(5);
		
	}
}
