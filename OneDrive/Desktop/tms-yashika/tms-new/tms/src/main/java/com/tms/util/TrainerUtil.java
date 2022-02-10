package com.tms.util;

import com.tms.beans.TrainerLogin;

public class TrainerUtil {

	public TrainerUtil() {}
	
	public static boolean isValid(TrainerLogin login) {
		return login.getUserName().length()<6 || !login.getPassword().contains("@");
	}

	
}
