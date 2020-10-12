package com.hsbc;

import java.util.List;

public class AccountServiceImpl implements AccountService {

	//Wrong Implementation
	//private JdbcBackedDao backedDao;
	
	//correct Implementation
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}



	public AccountServiceImpl() {
		super();
		System.out.println("Constructor of AccountServiceImpl");
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
