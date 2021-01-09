package com.bookstore.model.dao;

import java.util.List;
// hib
public class BookDaoImplHib implements BookDao{

	@Override
	public List<Book> getAllBooks() {
		System.out.println("getting all books using hibernate");
		return null;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
