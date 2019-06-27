package com.iflytek.view;

import java.util.Scanner;

public class Home {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int key;
		System.out.println("");
		System.out.println("==========================图书管理系统========================");
		System.out.println("用户类型\n\t1、管理员  2、普通用户");
		System.out.print("请选择：");
		
		key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("您已选择在管理员端登录\n");
			ManagerUI managerUI = new ManagerUI();
			managerUI.managerRun();
			break;

		default:
			System.out.println("请输入正确的序号！");
			break;
		}
		
		
		
	}
}
