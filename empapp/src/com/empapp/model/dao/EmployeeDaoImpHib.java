package com.empapp.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.empapp.model.exceptions.DataAccessException;
import com.empapp.model.exceptions.HibernateException;

//some hibeante code
public class EmployeeDaoImpHib implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() throws DataAccessException {
		System.out.println("some hib code");
		try {
			if (1 == 2)
				throw new HibernateException("some hib prob");
		} catch (HibernateException ex) {
			throw new DataAccessException(ex.getMessage());

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
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

}
