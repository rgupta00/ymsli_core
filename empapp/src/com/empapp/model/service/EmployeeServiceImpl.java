package com.empapp.model.service;

import java.util.List;

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
		employeeDao=new EmployeeDaoImplMongodb();
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
	public Employee getEmployeeById(int eid) {
		Employee employee=employeeDao.getEmployeeById(eid);
		if(employee==null)
			throw new EmployeeNotFoundException("employee with id :"+eid+" is not found");
		return employee;
	}

	@Override
	public List<Employee> getHigherSalaryEmployees(int salary) {
		return null;
	}

}
