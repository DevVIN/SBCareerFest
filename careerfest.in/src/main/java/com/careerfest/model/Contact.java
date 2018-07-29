package com.careerfest.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
public class Contact {
	
	@NotNull
	@NotEmpty(message="*Please Provide Full Name")
	String name;
	@NotEmpty(message="*Please Provide valid Email-Id")
	@Email
	String emailid;
	@NotNull
	@NotEmpty(message="*Please Enter Comment")
	String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
