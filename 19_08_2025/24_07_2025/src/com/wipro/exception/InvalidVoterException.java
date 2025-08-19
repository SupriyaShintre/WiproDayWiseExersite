package com.wipro.exception;

public class InvalidVoterException extends Exception{
	
	String message;

	public InvalidVoterException(String message) {
		super(message);
		
	}

	
	
}
