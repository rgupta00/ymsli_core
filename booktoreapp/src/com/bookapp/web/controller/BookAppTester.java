package com.bookapp.web.controller;
import java.sql.*;
import java.util.*;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.ConnectionFactory;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;
public class BookAppTester {
	
	public static void main(String[] args) {
		
		BookService bookService=new BookServiceImpl();
		
		try {
			List<Book>books=bookService.getAllBooks();
			for(Book book: books) {
				System.out.println(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*
		 * Connection connection=ConnectionFactory.getConnection(); if(connection!=null)
		 * System.out.println("done");
		 */
	}

}
