package com.empapp.model.dao;

import java.util.List;
import java.util.Optional;

import com.empapp.model.exceptions.DataAccessException;
import com.empapp.model.exceptions.MongoDbException;

public class EmployeeDaoImplMongodb implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() throws DataAccessException {
		System.out.println("some mongodb code");
		try {
			if(1==2)
				throw new MongoDbException("some mongodb error");
		}catch(MongoDbException ex) {
			new DataAccessException(ex.getMessage());
		}
		return null;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(int eid, Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Employee> getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(null);
	}

}
