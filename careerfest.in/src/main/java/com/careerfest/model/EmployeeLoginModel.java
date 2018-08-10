package com.careerfest.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class EmployeeLoginModel {
	@NotNull
	@Email(message = "*Please Provide a Valid E-mail Id")
	@NotEmpty(message = "*Please Enter valid Email Address")
	String employeeLoginEmail;
	
	@NotNull
	@NotEmpty(message = "*Please Enter Valid a Password")
	String employeeLoginPassword;

	public String getEmployeeLoginEmail() {
		return employeeLoginEmail;
	}

	public void setEmployeeLoginEmail(String employeeLoginEmail) {
		this.employeeLoginEmail = employeeLoginEmail;
	}

	public String getEmployeeLoginPassword() {
		return employeeLoginPassword;
	}

	public void setEmployeeLoginPassword(String employeeLoginPassword) {
		this.employeeLoginPassword = employeeLoginPassword;
	}

	
	
}
