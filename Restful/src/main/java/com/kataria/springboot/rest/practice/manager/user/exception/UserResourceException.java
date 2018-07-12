package com.kataria.springboot.rest.practice.manager.user.exception;

import org.springframework.http.HttpStatus;

import com.kataria.springboot.rest.practice.core.exception.CoreException;

public class UserResourceException extends CoreException {

	private static final long serialVersionUID = 1L;

	public UserResourceException() {
		super();
	}

	public UserResourceException(String message, Throwable cause, String responseCode, HttpStatus httpStatus) {
		super(message, cause, responseCode, httpStatus);
	}
	
	public UserResourceException(String message, Throwable cause, String responseCode) {
		super(message, cause, responseCode);
	}

}