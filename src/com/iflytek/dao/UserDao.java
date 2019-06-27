package com.iflytek.dao;

import java.util.List;

import com.iflytek.model.User;

public interface UserDao {

	public List<User> getUserList();
	
	public User getUserByAccount(List<Object> params);
}
