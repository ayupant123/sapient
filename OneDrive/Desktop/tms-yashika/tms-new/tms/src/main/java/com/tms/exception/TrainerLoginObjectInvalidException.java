package com.tms.exception;

public class TrainerLoginObjectInvalidException {

	private static final long serialVersionUID = 1L;
	private String msg;
	
	public TrainerLoginObjectInvalidException() {
        this.msg = "Trainer Login Object Invalid Please Check";
	}

	public TrainerLoginObjectInvalidException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "TrainerLoginObjectInvalidException [msg=" + msg + "]";
	}
	
	
	
	
	
	
}
