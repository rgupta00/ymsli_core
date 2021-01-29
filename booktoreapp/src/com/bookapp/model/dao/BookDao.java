package com.bookapp.model.dao;
import java.sql.SQLException;
import java.util.*;
public interface BookDao {
	public List<Book> getAllBooks()throws SQLException ;
	public void addBook(Book book);
	public void updateBook(int id, Book book);
	public void deleteBook(int id);
	public Book getBookById(int id);
	public Book getbookByIsbn(String isbn);
	
}
