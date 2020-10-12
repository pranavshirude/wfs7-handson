package com.hsbc;

import java.util.List;

public class JdbcBackedDao implements AccountDao {
	
	private DBUtility dbutility;
	
	

	public void setDbutility(DBUtility dbutility) {
		this.dbutility = dbutility;
	}
	
	
	
	public JdbcBackedDao(DBUtility dbutility) {
		super();
		this.dbutility = dbutility;
	}



	public JdbcBackedDao() {
		// TODO Auto-generated constructor stub
		System.out.println("cons of JDBCBackedDao");
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		dbutility.getConnection();
		System.out.println("creatAcc() Method of JdbcBackedDemo");
		
	}

	@Override
	public List<String> getAccounts() {
		// TODO Auto-generated method stub
		dbutility.getConnection();
		System.out.println("getAcc() Method of JdbcBackedDemo");
		return null;
	}
	
	
}
