package com.iflytek.model;

public class Book {

	private int id;
	private String bookName;
	private String bookType;
	private String publisher;//出版社
	private String edition;//版本
	private String barCode;//条形码
	private double price;
	private int bookCount;
	private int flag;//flag=0表示书籍可以正常借阅   flag=1书籍已下架
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookType() {
		return bookType;
	}
	
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getEdition() {
		return edition;
	}
	
	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	public String getBarCode() {
		return barCode;
	}
	
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getBookCount() {
		return bookCount;
	}
	
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	
	public int getFlag() {
		return flag;
	}
	
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	
	
	
}
