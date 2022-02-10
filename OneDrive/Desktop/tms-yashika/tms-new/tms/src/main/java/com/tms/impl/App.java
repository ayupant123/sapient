package com.tms.impl;

import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tms.controller.EmployeeLoginController;
import com.tms.controller.EmployeeRegistrationController;
import com.tms.controller.TrainerLoginController;
import com.tms.controller.TrainerRegistrationController;
import com.tms.util.HibernateUtil;
import com.tms.util.ReadData;



/**
 * 
 * @author Ayushi Pant
 * @since jan 2022
 * @version 1.0
 *
 *
 */

public class App {
	
public static void main(String[] args) throws IOException {
	      Session session	= HibernateUtil.getSessionFactory().openSession();
          Transaction transaction =  session.beginTransaction();

		System.out.println("------Welcome to Trainer Management System-------");
		
		mainMenu(session);
		
}
	
	public static void trainer(Session session) throws IOException{
		
		System.out.println("---------------------------------------------");
		System.out.println("----------Welcome to Trainer Module----------");
		System.out.println("-----------Please Select an Action-----------");
		System.out.println("0. Register a New User");
		System.out.println("1. Login to an existing account");
		System.out.println("2. Go back to Main Menu");
		System.out.println("---------------------------------------------");
		int ch = ReadData.getIntegerValue("choice");
		switch(ch)
		
		{
		case 0:
			TrainerRegistrationController.register(session);
			break;
		case 1: TrainerLoginController.login(session);
		   break;
		case 2: mainMenu(session);
				break;
		default:System.out.println("Please enter a valid choice"); 
		}
	}
	
	public static void employee(Session session) throws IOException {
		System.out.println("-------------------------------------------------");
		System.out.println("-----------Welcome to Employee Module-------------");
		System.out.println("-------------Please Select an Action-------------");
		System.out.println("0. Register a New User");
		System.out.println("1. Login to an existing account");
		System.out.println("2. Go back to Main Menu");
		System.out.println("-------------------------------------------------");
		
		int ch = ReadData.getIntegerValue("choice-> ");
		
		switch(ch)
		{
		case 0: EmployeeRegistrationController.register(session);
		System.out.println("");
		break;
		case 1: EmployeeLoginController.login(session);
		break;
		case 2: mainMenu(session);
		break;
		default: 
			System.out.println("Please enter a valid option!");
		}
		}
		
		public static void mainMenu(Session session) throws IOException{
			System.out.println("-----------Select an Option to continue----------");
			System.out.println("0. Trainer");
			System.out.println("1. Employee");
			System.out.println("2. Exit");
			System.out.println("-------------------------------------------------");
			
			int choice = ReadData.getIntegerValue("choice");
			
			switch(choice) {
			case 0:
				trainer(session);
				break;
			case 1:
				employee(session);
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("Please choose a correct option!!");
				break;
		}
	}

}



