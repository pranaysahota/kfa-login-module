package com.kickfitness.login.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = "true")
public class MemberLoginDetails {

	private String emailId;
	private String password;

	public MemberLoginDetails(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

}
