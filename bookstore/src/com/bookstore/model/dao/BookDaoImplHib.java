package com.bookstore.model.dao;

import java.util.List;

public class BookDaoImplHib implements BookDao {

	@Override
	public List<Book> getAllBooks() {
		return null;
	}

	@Override
	public void addBook(Book book) throws DataAccessException {
		try {
			///
			if(1==1)
				throw new HibernateExcetion();
		}catch(HibernateExcetion ex) {
			throw new DataAccessException(ex);
		}
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
