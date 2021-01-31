package com.bookapp.web.controller;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.ConnectionFactory;
import com.bookapp.model.exceptions.DataAccessException;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;
public class BookAppTester {
	
	public static void main(String[] args) throws ParseException {
		
		BookService bookService=new BookServiceImpl();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/dddd");
		Date date=dateFormat.parse("12/11/2018");
		
		Book book=new Book("ZA12", "let us c", "YK", date, 600);
		try {
			bookService.addBook(book);
			System.out.println("book is added");
		} catch (DataAccessException e) {
			System.out.println(e);
		}
//		try {
//			List<Book>books=bookService.getAllBooks();
//			for(Book book: books) {
//				System.out.println(book);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		/*
		 * Connection connection=ConnectionFactory.getConnection(); if(connection!=null)
		 * System.out.println("done");
		 */
	}

}
