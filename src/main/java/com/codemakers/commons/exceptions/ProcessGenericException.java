package com.codemakers.commons.exceptions;

public class ProcessGenericException extends RuntimeException {

	private final long serialVersionUID = 1L;
	
	public ProcessGenericException() {}
	
	public ProcessGenericException(String message) {
		super(message);
	}
	
	public ProcessGenericException(Throwable throwable) {
		super(throwable);
	}
	
	public ProcessGenericException(String message, Throwable throwable) {
		super(message, throwable);
	}
}