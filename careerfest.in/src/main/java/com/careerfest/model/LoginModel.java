package com.careerfest.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class LoginModel {
	
	
	@NotNull
	@Email(message = "*Please Provide a Valid E-mail Id")
	@NotEmpty(message = "*Please Enter valid Email Address")
	String loginEmail;
	
	@NotNull
	@NotEmpty(message = "*Please Enter Valid a Password")
	String loginPassword;

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	

}
