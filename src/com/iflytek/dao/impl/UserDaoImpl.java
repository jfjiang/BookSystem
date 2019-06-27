package com.iflytek.dao.impl;

import java.util.List;

import com.iflytek.dao.UserDao;
import com.iflytek.model.User;
import com.iflytek.util.DataHelper;

public class UserDaoImpl implements UserDao {

	DataHelper dp = new DataHelper();
	
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM users WHERE flag=0;";
		List<User> userList = dp.executeQuery(dp.getConnerction(), sql, null);
		
		return userList;
	}

	/**
	 * 根据账号查找用户信息
	 */
	@Override
	public User getUserByAccount(List<Object> params) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM users WHERE flag=0 AND accountType=1 AND account=?;";
		List<User> userList = dp.executeQuery(dp.getConnerction(), sql, params);
		if (userList==null||userList.size()==0) {
			return null;
		}
		return userList.get(0);
	}

}
