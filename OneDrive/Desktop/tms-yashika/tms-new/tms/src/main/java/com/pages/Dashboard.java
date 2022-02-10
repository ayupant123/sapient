package com.pages;
//personal profile
//dashboard

import java.io.IOException;

import org.hibernate.Session;

import com.tms.impl.App;
import com.tms.util.ReadData;

public class Dashboard {
	

	public static void dashboard(Session session, String userName) throws IOException {
		System.out.println("------Welcome to Trainer Dashboard "+ userName);
		System.out.println("-----------Select an Option to continue----------");
		System.out.println("0. Personal Profile");
		System.out.println("1. TOC Module");
		System.out.println("2. Exit");
		System.out.println("-------------------------------------------------");
		
		int choice = ReadData.getIntegerValue("choice");
        
		switch(choice) {
		case 0:
			PersonalProfile.profile(session, userName);
			break;
		case 1:
			//Toc.toc(session);
			//break;
		case 2:
			App.mainMenu(session);
			break;
		}

		
	}
	}
