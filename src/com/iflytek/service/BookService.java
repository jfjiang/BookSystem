package com.iflytek.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iflytek.dao.BookDao;
import com.iflytek.dao.impl.BookDaoImpl;
import com.iflytek.model.Book;

public class BookService {

	private BookDao bookDao = new BookDaoImpl();
	//创建输入对象
	private static Scanner sc = new Scanner(System.in);
	
	public boolean saveBook() {
		List<Object> params = new ArrayList<>();
		System.out.print("请输入书名：");
		params.add(sc.next());
		System.out.print("请输入书籍类型：");
		params.add(sc.next());
		System.out.print("请输入出版社：");
		params.add(sc.next());
		System.out.print("请输入书籍版本：");
		params.add(sc.next());
		System.out.print("请输入条形码：");
		params.add(sc.next());
		System.out.print("请输入价格：");
		params.add(getDouble(sc));
		System.out.print("请输入总数量：");
		params.add(getInt(sc));
		
		boolean rs = bookDao.saveBook(params);
		
		return rs;
	}
	
	
	public void showBooks() {
		List<Book> bookList = bookDao.getAllBook();
		System.out.println("id\t书名\t版本\t类别\t出版社\t条形码\t\t价格\t库存量");
		for (Book book : bookList) {
			System.out.println(book.getId()+"\t"+book.getBookName()+"\t"+book.getEdition()+"\t"+book.getBookType()+"\t"+book.getPublisher()+"\t"+book.getBarCode()+"\t"+book.getPrice()+"\t"+book.getBookCount());
		}
	}
	
	
	private static int getInt(Scanner sc) {
		String str = sc.next();
		int result = 0;
		
		try {
			result = Integer.parseInt(str);
			
		} catch (Exception e) {
			System.out.println("您输入的内容有误，请重新输入");
			getInt(sc);
		}
		return result;
	}
	
	
	private static double getDouble(Scanner sc) {
		String str = sc.next();
		double result = 0.0;
		
		try {
			result = Double.parseDouble(str);
			
		} catch (NumberFormatException e) {
			System.out.println("您输入的内容有误，请重新输入：");
			getDouble(sc);
		}
		return result;
	}
}
