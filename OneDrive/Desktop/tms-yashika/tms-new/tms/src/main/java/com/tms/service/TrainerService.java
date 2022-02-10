package com.tms.service;


import com.tms.exception.NameTooShortException;


public class TrainerService implements ITrainer {
	
	
	public  void validateName(String name) throws NameTooShortException {
		if(!checkName(name)) {
			throw new NameTooShortException("Name too small");
		}
	}

	
	public boolean checkName(String name) {
	   	return name.length()>4;
	   		
	   	
	}
	


	
	
}
