package com.bookapp.model.service;

import java.sql.SQLException;
import java.util.List;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;

	public BookServiceImpl() {
		bookDao=new BookDaoImpl();
	}

	@Override
	public List<Book> getAllBooks() throws SQLException {
		//BL
		List<Book> books=bookDao.getAllBooks();
		return books;
	}

	@Override
	public void addBook(Book book)throws SQLException {
		// TODO Auto-generated method stub
		bookDao.addBook(book);
	}

	@Override
	public void updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getbookByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

}
