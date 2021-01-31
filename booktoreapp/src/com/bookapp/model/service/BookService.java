package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.dao.Book;
import com.bookapp.model.exceptions.DataAccessException;

public interface BookService {
	public List<Book> getAllBooks()throws DataAccessException ;
	public void addBook(Book book) ;
	public void updateBook(int id, Book book);
	public void deleteBook(int id);
	public Book getBookById(int id);
	public Book getbookByIsbn(String isbn);
}
