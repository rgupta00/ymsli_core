package com.empapp.model.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 6074656674446984279L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
