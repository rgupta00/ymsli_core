package com.bookstore.web.controller;

import com.bookstore.model.dao.Book;
import com.bookstore.model.dao.BookDao;
import com.bookstore.model.dao.BookDaoImpl;
import com.bookstore.model.dao.BookDaoImplHib;
import com.bookstore.model.service.BookService;
import com.bookstore.model.service.BookServiceImpl;
import java.util.*;
public class BookController {

	public static void main(String[] args) {
		//
		BookDao dao=new BookDaoImplHib();
		
		BookService bookService=new BookServiceImpl(dao);
		
		List<Book>books=bookService.getAllBooks();
		
	}
}
