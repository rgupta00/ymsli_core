package com.empapp.web.controller;
import java.sql.SQLException;
import java.util.*;
import java.util.function.Predicate;

import com.empapp.model.dao.Employee;
import com.empapp.model.exceptions.DataAccessException;
import com.empapp.model.exceptions.EmployeeNotFoundException;
import com.empapp.model.service.EmployeeService;
import com.empapp.model.service.EmployeeServiceImpl;

public class DemoController {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		
		Optional<Employee> empOpt=employeeService.getEmployeeById(12);
		
		String empName=empOpt.map(emp->emp.getEname()).orElse("name not found");
		System.out.println(empName);
		
		
		
//		
//		List<Employee> employees;
//		try {
//			employees = employeeService.getAllEmployees();
////			for(Employee employee:employees) {
////				System.out.println(employee);
////			}
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
	
//		Predicate<Employee> higherSalaryPre= emp->  emp.getSalary()>=50;
//		System.out.println("----------higher sal getter ------");
//		List<Employee> employeesHigherSalaryGetter=
//				employeeService.getEmployeeByPredicte(higherSalaryPre);
//		employeesHigherSalaryGetter.forEach(e->System.out.println(e));
//		
//		
//		System.out.println("--------bangloreEmp-------------");
//		Predicate<Employee> bangloreEmpPredicate= emp-> emp.getCity().equalsIgnoreCase("banglore");
//		
//
//		List<Employee> bangloreEmp=
//				employeeService.getEmployeeByPredicte(bangloreEmpPredicate);
//		bangloreEmp.forEach(e->System.out.println(e));
		
		
		
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
