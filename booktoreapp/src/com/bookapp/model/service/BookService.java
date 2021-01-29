package com.bookapp.model.service;

import java.sql.SQLException;
import java.util.List;

import com.bookapp.model.dao.Book;

public interface BookService {
	public List<Book> getAllBooks()throws SQLException ;
	public void addBook(Book book)throws SQLException;
	public void updateBook(int id, Book book);
	public void deleteBook(int id);
	public Book getBookById(int id);
	public Book getbookByIsbn(String isbn);
}
