package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setter Injection calls setter method using property tag
		//Constructor Injection calls parameterised constructor using constructor-arg tag with help of index attribute to identify number of indexes 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		DBUtility utility = (DBUtility) context.getBean("db");
//		System.out.println("Username : "+ utility.getUsername());
//		System.out.println("Password : "+ utility.getPassword());
//		utility.getConnection();
//		
		
		//Calling from Dao layer
		AccountDao accountDao = (AccountDao) context.getBean("dao");
		accountDao.createAccount();
		accountDao.getAccounts();
		System.out.println("-----------------------------------------------------");
		HibernateBackedDao hibernateBackedDao = (HibernateBackedDao) context.getBean("hDao");
		hibernateBackedDao.createAccount();
		hibernateBackedDao.getAccounts();
		
		//Adding Service layer to the architecture and Calling Service Layer from client
		
		AccountService accountService = (AccountService) context.getBean("service");
		accountService.createAcc();
		accountService.getAcc();
		accountService.getAccSortedByName();
		
		
	}

}
