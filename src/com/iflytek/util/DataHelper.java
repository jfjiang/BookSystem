package com.iflytek.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iflytek.model.Book;
import com.iflytek.model.User;

public class DataHelper {

	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	private static final String URL= "jdbc:mysql://127.0.0.1/booksystem?useUnicode=true&characterEncoding=utf-8";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	public Connection getConnerction() {
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			return connection;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public boolean execute(Connection conn, String sql, List<Object> params) {
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			if (params!=null) {
				for(int i=0;i<params.size();i++) {
					ps.setObject(i+1, params.get(i));
				}
			}
			int rs = ps.executeUpdate();
			//三目表达式
			return rs>0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public List<User> executeQuery(Connection conn, String sql, List<Object> params){
		List<User> userList = new ArrayList<User>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			if (params!=null) {
				for(int i=0;i<params.size();i++) {
					ps.setObject(i+1, params.get(i));
				}
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setAccount(rs.getString("account"));
				user.setPassword(rs.getString("password"));
				user.setAddress(rs.getString("address"));
				user.setAge(rs.getInt("age"));
				user.setEmail(rs.getString("email"));
				user.setFlag(rs.getInt("flag"));
				user.setIdCard(rs.getString("idCard"));
				user.setPhone(rs.getString("phone"));
				user.setSex(rs.getString("sex"));
				user.setUserName(rs.getString("userName"));
				userList.add(user);
			}
			return userList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public List<Book> getBookList(Connection conn, String sql, List<Object> params) {
		List<Book> userList = new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			if (params!=null) {
				for(int i=0;i<params.size();i++) {
					ps.setObject(i+1, params.get(i));
				}
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setBarCode(rs.getString("barCode"));
				book.setBookCount(rs.getInt("bookCount"));
				book.setBookName(rs.getString("bookName"));
				book.setBookType(rs.getString("bookType"));
				book.setEdition(rs.getString("edition"));
				book.setFlag(rs.getInt("flag"));
				book.setPrice(rs.getDouble("price"));
				book.setPublisher(rs.getString("publisher"));
				
				userList.add(book);
			}
			return userList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
