package com.iflytek.dao;

import java.util.List;

import com.iflytek.model.Book;

public interface BookDao {

	/**
	   *  查询所有书籍
	 * @return
	 */
	public List<Book> getAllBook();
	
	/**
	 * 书籍上架
	 * @param params
	 * @return
	 */
	public boolean saveBook(List<Object> params);
}
