package com.hsbc;

public class DBUtility {

	private String username;
	private String password;
	
	public DBUtility(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		System.out.println("print from para construct of DBUtility");
	}
	
	//Getter and Setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void getConnection() {
		System.out.println("getConnection() method of DBUtility");
	}
	
	
}
