package com.bookstore.model.dao;
//This class is called Exception wrapper
//what is the use? to wrape all possble excetpions from dao layers
//so that my dao interface should be loosy coupled from choice of tech...


public class DataAccessException extends Exception{

	public DataAccessException(Throwable cause) {
		super(cause);
	}

}
