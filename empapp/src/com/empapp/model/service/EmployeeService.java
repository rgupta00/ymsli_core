package com.empapp.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.empapp.model.dao.Employee;
import com.empapp.model.exceptions.DataAccessException;

public interface EmployeeService {
	public List<Employee> getAllEmployees()throws DataAccessException;
	public void addEmployee(Employee employee);
	public void updateEmployee(int eid,Employee employee);
	public void deleteEmployee(int eid);
	public Optional<Employee> getEmployeeById(int eid);
	public List<Employee> getHigherSalaryEmployees(int salary);
	
	public List<Employee>getEmployeeByPredicte(Predicate<Employee> predicate);
}
