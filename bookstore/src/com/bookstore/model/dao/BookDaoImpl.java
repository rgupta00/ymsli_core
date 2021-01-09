package com.bookstore.model.dao;

import java.util.List;
//jdbc
public class BookDaoImpl implements BookDao{

	@Override
	public List<Book> getAllBooks() {
		System.out.println("getting all books using jdbc");
		return null;
	}

	@Override
	public void addBook(Book book) {
		
	}

	@Override
	public Book getBookById(int id) {
		
		return null;
	}

}
