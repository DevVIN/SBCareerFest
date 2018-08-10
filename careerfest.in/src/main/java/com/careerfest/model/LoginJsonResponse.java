package com.careerfest.model;

import java.util.Map;

public class LoginJsonResponse {

	private User user;
	private Employer employer;	
	private boolean validated;
	private String emessage;
	private Map<String, String> errorMessages;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isValidated() {
		return validated;
	}
	public void setValidated(boolean validated) {
		this.validated = validated;
	}
	public Map<String, String> getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(Map<String, String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	public String getEmessage() {
		return emessage;
	}
	public void setEmessage(String emessage) {
		this.emessage = emessage;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	
}
