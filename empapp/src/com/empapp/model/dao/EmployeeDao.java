package com.empapp.model.dao;
import java.sql.SQLException;
import java.util.*;

import com.empapp.model.exceptions.DataAccessException;

public interface EmployeeDao {
	public List<Employee> getAllEmployees()throws DataAccessException;
	public void addEmployee(Employee employee);
	public void updateEmployee(int eid,Employee employee);
	public void deleteEmployee(int eid);
	public Employee getEmployeeById(int eid);
}
