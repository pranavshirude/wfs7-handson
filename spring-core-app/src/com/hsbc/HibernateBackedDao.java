package com.hsbc;

import java.util.List;

public class HibernateBackedDao implements AccountDao {
	
	private DBUtility hDbutility;
	
	

	public void sethDbutility(DBUtility hDbutility) {
		this.hDbutility = hDbutility;
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		hDbutility.getConnection();
		System.out.println("creatAcc() Method of HibernateBackedDemo");	
	}

	@Override
	public List<String> getAccounts() {
		// TODO Auto-generated method stub
		hDbutility.getConnection();
		System.out.println("getAcc() Method of HibernateBackedDemo");	
		return null;
	}

}
