package com.acadgild.agmail.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginBean {

	@NotEmpty(message="Login Name is mandatory.")
	private String loginName;
	@NotEmpty(message="Login Password is mandatory.")
	private String loginPassword;
	private String errorMsg;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
}
