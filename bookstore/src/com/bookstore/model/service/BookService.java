package com.bookstore.model.service;

import java.util.List;

import com.bookstore.model.dao.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public List<Book>getAllCostlyBooks(double price);
	public void addBook(Book book);
	public Book getBookById(int id);
	
}
