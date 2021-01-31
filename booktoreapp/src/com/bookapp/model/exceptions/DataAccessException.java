package com.bookapp.model.exceptions;

public class DataAccessException extends RuntimeException{

	private static final long serialVersionUID = 3854057283824390246L;

	public DataAccessException(String message) {
		super(message);
	}
}
