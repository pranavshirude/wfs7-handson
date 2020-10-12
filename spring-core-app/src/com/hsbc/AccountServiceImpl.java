package com.hsbc;

import java.util.List;

public class AccountServiceImpl implements AccountService {

	private JdbcBackedDao backedDao;
	
	public void setBackedDao(JdbcBackedDao backedDao) {
		this.backedDao = backedDao;
	}
	
	

	public AccountServiceImpl() {
		super();
		System.out.println("Const of AccountServiceImpl");
		// TODO Auto-generated constructor stub
	}



	@Override
	public void createAcc() {
		System.out.println("createAcc() from AccountService");
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getAcc() {
		System.out.println("getAcc() from AccountService");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAccSortedByName() {
		System.out.println("getAccSortedByName() from AccountService");
		// TODO Auto-generated method stub
		return null;
	}

}
