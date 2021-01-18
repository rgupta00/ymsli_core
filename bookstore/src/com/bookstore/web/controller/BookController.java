package com.bookstore.web.controller;

import java.util.List;

import com.bookstore.model.dao.Book;
import com.bookstore.model.dao.BookDao;
import com.bookstore.model.dao.BookDaoImplHib;
import com.bookstore.model.dao.BookDaoImplJdbc;
import com.bookstore.model.dao.DataAccessException;
import com.bookstore.model.service.BookService;
import com.bookstore.model.service.BookServiceImpl;
public class BookController {

	public static void main(String[] args) {
		//
		BookDao dao=new BookDaoImplHib();
		
		BookService bookService=new BookServiceImpl(dao);
		
		//List<Book>books=bookService.getAllBooks();
		Book book=new Book(121, "java", 300);
		try {
			bookService.addBook(book);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}
}
