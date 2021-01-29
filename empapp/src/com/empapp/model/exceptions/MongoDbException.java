package com.empapp.model.exceptions;

public class MongoDbException extends Exception {
	private static final long serialVersionUID = -8857635448069869277L;

	public MongoDbException(String message) {
		super(message);
	}
}
