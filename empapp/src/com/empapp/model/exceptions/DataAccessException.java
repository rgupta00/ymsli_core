package com.empapp.model.exceptions;
//aka ex wapper 
public class DataAccessException extends RuntimeException{

	private static final long serialVersionUID = 702349088665004917L;

	public DataAccessException(String message) {
		super(message);
	}
}
