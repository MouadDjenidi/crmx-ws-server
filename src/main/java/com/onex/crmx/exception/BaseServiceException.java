package com.onex.crmx.exception;

public class BaseServiceException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public String message;
	
	BaseServiceException(String message){
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}