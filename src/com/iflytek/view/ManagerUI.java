package com.iflytek.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.iflytek.dao.UserDao;
import com.iflytek.dao.impl.UserDaoImpl;
import com.iflytek.model.User;
import com.iflytek.service.BookService;

public class ManagerUI {

	//private boolean flag = true;
	private UserDao userDao = new UserDaoImpl();
	
	private BookService bookService = new BookService();
	//创建输入对象
	private Scanner sc = new Scanner(System.in);
	
	public void managerRun() {
		boolean loginFlag = false;
		while (!loginFlag) {
			loginFlag = login();
		}
		
		
		while(loginFlag) {
			System.out.println("");
			System.out.println("****************菜单****************");
			System.out.println("1、书籍上架  2、书籍下架  3、书籍借出  4、书籍归还  5、展示库存  6、统计  7、退出");
			System.out.print("请选择：");
			
			int key = sc.nextInt();
			switch (key) {
			
			case 1:
				boolean saveFlag = bookService.saveBook();
				if(saveFlag)
					System.out.println("书籍上架成功！");
				else
					System.out.println("书籍上架失败！");
				break;
				
			case 5:
				bookService.showBooks();
				break;
				
			case 7:
				System.out.println("谢谢使用，已退出！");
				loginFlag = false;
				break;

			default:
				System.out.println("菜单选择有误，请重新选择！");
				break;
			}
		}
	}
	
	
	
	
	/**
	 * 登录系统
	 * @param account
	 * @param password
	 * @return
	 */
	private boolean login() {
		System.out.print("请输入账号：");
		String account = sc.next();
		System.out.print("请输入密码：");
		String password = sc.next();
		List<Object> params = new ArrayList<Object>();
		params.add(account);
		User user = userDao.getUserByAccount(params);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (user==null) {
			System.out.println("用户未注册，登录失败！\n");
			return false;
		}else {
			if (user.getPassword().equals(password)) {
				System.out.println("登录成功！");
				System.out.println(user.getUserName()+" 您好！欢迎登录系统，当前时间："+sf.format(new Date()));
				return true;
			}else {
				System.out.println("密码错误，登录失败！\n");
				return false;
			}
		}
		
	}
	
}
