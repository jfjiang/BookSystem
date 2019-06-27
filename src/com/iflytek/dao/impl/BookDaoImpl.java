package com.iflytek.dao.impl;

import java.util.List;

import com.iflytek.dao.BookDao;
import com.iflytek.model.Book;
import com.iflytek.util.DataHelper;

public class BookDaoImpl implements BookDao {

	private DataHelper dp = new DataHelper();
	
	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM books;";
		List<Book> bookList = dp.getBookList(dp.getConnerction(), sql, null);
		return bookList;
	}

	@Override
	public boolean saveBook(List<Object> params) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO books (bookName, bookType, publisher, edition, barCode, price, bookCount) VALUES (?,?,?,?,?,?,?);";
		boolean rs = dp.execute(dp.getConnerction(), sql, params);
		return rs;
	}

}
