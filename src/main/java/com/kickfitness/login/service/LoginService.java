package com.kickfitness.login.service;

import com.kickfitness.login.model.LoginResponse;
import com.kickfitness.login.model.MemberLoginDetails;

public interface LoginService {
	LoginResponse loginUser(MemberLoginDetails memberLoginDetails);
}
