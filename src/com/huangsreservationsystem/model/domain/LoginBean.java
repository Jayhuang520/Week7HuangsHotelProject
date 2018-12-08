package com.huangsreservationsystem.model.domain;

import java.io.Serializable;

public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 668758236624180568L;

	public LoginBean() {
	}
	
	public LoginBean(String userName,String password) {
		this.userName = userName;
		this.password = password;
	}
	
	/**Username for login*/
	private String userName;
	
	/**password for login*/
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
