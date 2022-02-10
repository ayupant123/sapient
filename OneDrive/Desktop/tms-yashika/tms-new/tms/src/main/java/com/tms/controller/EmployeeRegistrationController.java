package com.tms.controller;

import java.io.IOException;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tms.beans.EmployeeBeans;
import com.tms.impl.App;
import com.tms.util.ReadData;

public class EmployeeRegistrationController {
	
	static EmployeeBeans employee = new EmployeeBeans(); 

	public static void register(Session session) throws IOException  {
		

		System.out.println("---------------------------------------------");
		System.out.println("-----------Employee Registration-------------");
		
		
		employee.setEmpName(ReadData.getStringValue("Name ->  "));
		employee.setEmpEmail(ReadData.getStringValue("Email ID -> "));
		employee.setEmpPassword(ReadData.getStringValue("Password -> "));	
		employee.setEmpSalary(ReadData.getDoubleValue("Salary ->  "));
		
		session.save(employee); 
	    session.getTransaction().commit();;
		//saveEmployee(session, employee);
	    
	    System.out.println("Employee Successfully registered!!");
	    System.out.println("-------------------------------------------------");
		
		System.out.println("Please choose your next action:");
		System.out.println("0- Login to Employee account");
		System.out.println("1- Go back to Main Menu");
		
		int choice = ReadData.getIntegerValue("choice-> ");
		
		switch(choice) {
		case 0: EmployeeLoginController.login(session);
			break;
			
		case 1: App.mainMenu(session);
		break;
		}
	}
		
//	private static void saveEmployee(Session session, EmployeeBeans employee) throws NumberFormatException, IOException {
//		// you are only giving emp object to hibernate
//		session.save(employee); 
//		// the save to db will happen here 
//		session.getTransaction().commit();
//		
//		System.out.println();
//		System.out.println("Employee Successfully registered!!");
//	}


}
