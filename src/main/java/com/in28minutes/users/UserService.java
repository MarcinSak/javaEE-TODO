package com.in28minutes.users;

import java.util.HashMap;

public class UserService
{
	User user;
	private static HashMap<String, String> listOfUsers = new HashMap<String,String>();
	static {
		listOfUsers.put("Marcin", "123");
	}
	public boolean isAnUserRegistered(String user) {
		if(listOfUsers.containsKey(user))
			return true;
		return false;
	}
	public boolean isThePasswordCorrect(String user, String pass) {
		if (isAnUserRegistered(user))
			if(listOfUsers.get(user).equals(pass))
				return true;
		return false;
	}
}
