package com.hsbc;

import java.util.List;

public interface AccountService {
	
	public void createAcc();
	public List<String> getAcc();
	public List<String> getAccSortedByName();

}
