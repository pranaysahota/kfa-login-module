package com.kickfitness.login.model;

import javax.persistence.Entity;

@Entity
public class Member {
	private String emailId;
	private String name;
	private String occupation;
	private String age;
	private Gender gender;
	private String maritalStatus;
	private String residenceAddress;
	private Program program;
	private String mobileNumber;

	public Member(String name, String occupation, String age, Gender gender, String maritalStatus,
			String residenceAddress, Program program, String mobileNumber, String emailId) {
		this.name = name;
		this.occupation = occupation;
		this.age = age;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.residenceAddress = residenceAddress;
		this.program = program;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getResidenceAddress() {
		return residenceAddress;
	}

	public Program getProgram() {
		return program;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}
}
