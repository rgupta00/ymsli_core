package com.empapp.model.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.empapp.model.dao.Employee;
import com.empapp.model.dao.EmployeeDao;
import com.empapp.model.dao.EmployeeDaoImpHib;
import com.empapp.model.dao.EmployeeDaoImpl;
import com.empapp.model.dao.EmployeeDaoImplMongodb;
import com.empapp.model.exceptions.DataAccessException;
import com.empapp.model.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl() {
		employeeDao=new EmployeeDaoImpl();
	}

	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}


	@Override
	public List<Employee> getAllEmployees()throws DataAccessException {
		List<Employee>employees=employeeDao.getAllEmployees();
		return employees;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	@Override
	public void updateEmployee(int eid, Employee employee) {
		employeeDao.updateEmployee(eid, employee);
	}

	@Override
	public void deleteEmployee(int eid) {
		employeeDao.deleteEmployee(eid);
		
	}

	@Override
	public Optional<Employee> getEmployeeById(int eid) {
		return employeeDao.getEmployeeById(eid);
	}

	@Override
	public List<Employee> getHigherSalaryEmployees(int salary) {
		return null;
	}

	@Override
	public List<Employee> getEmployeeByPredicte(Predicate<Employee> predicate) {
		return getAllEmployees()
				.stream().filter(predicate).collect(Collectors.toList());
	}

}
