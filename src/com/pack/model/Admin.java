package com.pack.model;

public class Admin {

	public Admin() {
		// TODO Auto-generated constructor stub
	}
	private int userid;
	private String password;
	private int count;
	private String username;
	private String designation;
	private String office;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Admin(int userid, String password, int count) {
		super();
		this.userid = userid;
		this.password = password;
		this.count = count;
	}
	public Admin(int userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	

}
