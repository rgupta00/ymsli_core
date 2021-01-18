package com.bookstore.model.dao;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {
	List<Book> getAllBooks();
	void addBook(Book book)throws DataAccessException;
	Book getBookById(int id);

}