package com.habib.todo_app.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String passwoord) {
		
		boolean isValidUserName = username.equalsIgnoreCase("username");
		boolean isValidPassword = passwoord.equalsIgnoreCase("password");
		
		return isValidUserName & isValidPassword;
	}
	
}
