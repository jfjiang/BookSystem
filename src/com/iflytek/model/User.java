package com.iflytek.model;

public class User {

	private int id;
	private String account;
	private String password;
	private int accountType;
	private String phone;
	private String address;
	private int age;
	private String sex;
	private String userName;
	private String email;
	private String idCard;
	private int flag;
	
	
	public User() {
		super();
	}
	
	public User(int id, String account, String password, String phone, String address, int age, String sex,
			String userName, String email, String idCard, int flag) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.age = age;
		this.sex = sex;
		this.userName = userName;
		this.email = email;
		this.idCard = idCard;
		this.flag = flag;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getIdCard() {
		return idCard;
	}
	
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	public int getFlag() {
		return flag;
	}
	
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	
	
}
