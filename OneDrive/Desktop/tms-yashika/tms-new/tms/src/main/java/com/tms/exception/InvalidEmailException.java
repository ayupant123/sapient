package com.tms.exception;

public class InvalidEmailException {
	
	private String msg ;

	public InvalidEmailException() {
	    this.msg = "Invalid Email Exception";	
	}

	public InvalidEmailException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidEmailException [msg=" + msg + "]";
	}

}
