package com.bookstore.model.service;

import java.util.List;

import com.bookstore.model.dao.Book;
import com.bookstore.model.dao.BookDao;
import com.bookstore.model.dao.BookDaoImplHib;
import com.bookstore.model.dao.BookDaoImplJdbc;
import com.bookstore.model.dao.DataAccessException;
//SOLI "D": DIP
//BookService has a composition of BookDaoImplJdbc
public class BookServiceImpl implements BookService{

	private BookDao bookDao;
	
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public List<Book> getAllCostlyBooks(double price) {
		List<Book> list= bookDao.getAllBooks();
		///
		return list;
	}

	@Override
	public void addBook(Book book) throws DataAccessException {
		//tx sec logging cacheing...
		
			bookDao.addBook(book);
		
	}

	@Override
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

}
