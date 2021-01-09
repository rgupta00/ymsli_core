package com.bookstore.model.dao;
import java.util.*;
public interface BookDao {
	public List<Book> getAllBooks();
	public void addBook(Book book);
	public Book getBookById(int id);
}
