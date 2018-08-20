package com.in28minutes.login;

import com.in28minutes.users.UserService;

public class LoginService
{
	public boolean isUserValid(String user, String pass) {
		UserService userService = new UserService();
		if(userService.isThePasswordCorrect(user, pass))
			return true;
		return false;
	}
}
