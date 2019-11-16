package com.sanlly.common.models.exception;

public class InvalidException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidException(){
		super();
	}
	
	public InvalidException(String message){
		super(message);
	}

}
