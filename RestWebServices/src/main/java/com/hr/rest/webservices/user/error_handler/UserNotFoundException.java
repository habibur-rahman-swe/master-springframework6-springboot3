package com.hr.rest.webservices.user.error_handler;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	private String errorMessage;

	public UserNotFoundException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
