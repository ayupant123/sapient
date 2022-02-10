package com.tms.exception;



/**
 * 
 * @author AYUSHI PANT
 * @see Exception class for name too short
 * @since Feb 2022
 * @version 1.0
 */

public class NameTooShortException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NameTooShortException(String msg) {
	}

	@Override
	public String toString() {
		return "Name to short , Please enter a valid name";
	}

	
	
	
	
		
}
