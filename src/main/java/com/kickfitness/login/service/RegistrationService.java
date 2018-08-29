package com.kickfitness.login.service;

import com.kickfitness.login.model.LoginResponse;
import com.kickfitness.login.model.Member;

public interface RegistrationService {
	LoginResponse registerUser(Member registrationForm);
}
