package com.bookstore.model.dao;

import java.sql.SQLException;
import java.util.List;
//jdbc
public class BookDaoImplJdbc implements BookDao{

	@Override
	public List<Book> getAllBooks() {
		System.out.println("getting all books using jdbc");
		return null;
	}

	
	public void addBook(Book book) throws DataAccessException{
		System.out.println("bookd added using jdbc");
		try {
			 if(1==2)
				 throw new SQLException();
		
			 ////
		}// wx wrapping and rethrowning
		catch(SQLException ex) {
			throw new DataAccessException(ex);
		}
		
	}

	
	public Book getBookById(int id) {
		
		return null;
	}

}
