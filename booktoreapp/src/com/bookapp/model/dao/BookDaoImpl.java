package com.bookapp.model.dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;
public class BookDaoImpl implements BookDao {

	private Connection connection;

	public BookDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Book> getAllBooks() throws SQLException {
		
		List<Book>books=new ArrayList<>();
		Book book=null;
		Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery("select * from books");
		while(rs.next()) {
			book=new Book
					(rs.getInt("id"),
				      rs.getString("isbn"), 
				      rs.getString("title"), 
				      rs.getString("author"),
				      rs.getDate("pubDate"), 
				      rs.getDouble("price"));
			books.add(book);
		}
		return books;
	}

	@Override
	public void addBook(Book book) throws SQLException {
		//we want to add a book to db
		//id | isbn | title         | author | pubDate    | price
		PreparedStatement pstmt=connection.prepareStatement
				("insert into books(isbn,title,author,pubDate,price) values(?,?,?,?,?)");
		pstmt.setString(1, book.getIsbn());
		pstmt.setString(2, book.getTitle());
		pstmt.setString(3, book.getAuthor());
		//?
		pstmt.setDate(4, new Date(book.getPubDate().getTime()));
		pstmt.setDouble(5, book.getPrice());
		pstmt.executeUpdate();
		
	}

	@Override
	public void updateBook(int id, Book book) {

	}

	@Override
	public void deleteBook(int id) {

	}

	@Override
	public Book getBookById(int id) {
		return null;
	}

	@Override
	public Book getbookByIsbn(String isbn) {
		return null;
	}

}
