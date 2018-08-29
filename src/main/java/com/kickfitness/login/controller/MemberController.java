package com.kickfitness.login.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kickfitness.login.model.LoginResponse;
import com.kickfitness.login.model.MemberLoginDetails;
import com.kickfitness.login.model.Member;
import com.kickfitness.login.service.LoginService;
import com.kickfitness.login.service.RegistrationService;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private ObjectMapper objMapper;
	@Autowired
	LoginService loginService;
	@Autowired
	RegistrationService registerService;
	private LoginResponse loginResponse;
	private MemberLoginDetails loginDetails;
	private Member regForm;

	@PostMapping(value = "/login")
	public LoginResponse login(String loginFormJson) {
		try {
			loginDetails = objMapper.readValue(loginFormJson, MemberLoginDetails.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		loginService.loginUser(loginDetails);
		return loginResponse;
	}

	@PostMapping(value = "/register")
	public LoginResponse register(String registrationFormJson) {
		try {
			regForm = objMapper.readValue(registrationFormJson, Member.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		registerService.registerUser(regForm);
		return loginResponse;
	}
}
