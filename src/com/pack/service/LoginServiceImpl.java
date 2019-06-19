package com.pack.service;

import com.pack.dao.LoginDaoImpl;
import com.pack.model.Admin;

public class LoginServiceImpl implements LoginService {

	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkLogin(Admin a) {
		// TODO Auto-generated method stub
		boolean value= new LoginDaoImpl().checkLogin(a);
		return value;
	}

	@Override
	public int getCount(Admin a) {
		// TODO Auto-generated method stub
		int count=new LoginDaoImpl().getCount(a);
		return count;
	}

	@Override
	public int incrementCount(Admin a, int count) {
		// TODO Auto-generated method stub
		int j=new LoginDaoImpl().incrementCount(a,count);
		return j;
	}

	@Override
	public int setZeroCount(Admin a) {
		// TODO Auto-generated method stub
		int count=new LoginDaoImpl().setZeroCount(a);
		return count;
	}

	@Override
	public String getUsername(Admin a) {
		// TODO Auto-generated method stub
		String username= new LoginDaoImpl().getUsername(a);
		return username;
	}

	@Override
	public String getDesignation(Admin a) {
		// TODO Auto-generated method stub
		String designation=new LoginDaoImpl().getDesignation(a);
		return designation;
	}

	@Override
	public String getOffice(Admin a) {
		// TODO Auto-generated method stub
		String office=new LoginDaoImpl().getOffice(a);
		return office;
	}

	
}
