package com.ubs.opsit.interviews.exception;

public class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String message;

	public BusinessException(String message) {
		super(message);
	}

	public String getMessage() {
		return message;
	}

}
