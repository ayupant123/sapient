package com.tms.controller;

import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tms.beans.TrainerRegistration;
import com.tms.exception.NameTooShortException;
import com.tms.impl.App;
import com.tms.service.TrainerService;
import com.tms.util.ReadData;



/**
 * @author Ayushi Pant
 * @see Trainer Registration Controller
 * @since
 * @version
 */
public class TrainerRegistrationController {
	
	static TrainerRegistration tr =  new TrainerRegistration();
	
	public static void register(Session session) throws IOException{
       
		TrainerService service = new TrainerService();
		
		
	   while(true) {
		   try {
			   
			    tr.setTrName(ReadData.getStringValue("Name ->"));
		    	 service.validateName(tr.getTrName());
		    	 break;
		    } catch(NameTooShortException e) {
		    	System.out.println(e.toString());
	        
		    }
	   }
	    
	   
	   
	    tr.setTrYearsOfExp(ReadData.getIntegerValue("years of Experience :"));
	    tr.setTrAreaOfExpertise(ReadData.getStringValue(" Area of Expertise :"));
	    tr.setTrEmail(ReadData.getStringValue("emailId :"));
	    tr.setTrPassword(ReadData.getStringValue("password :"));
	    tr.setTrMailingAddress(ReadData.getStringValue("Enter Mailing Address :"));
	    tr.setNumCompaniesTrained(ReadData.getIntegerValue("Number of Companies Trained :"));
	    tr.setTrFees(ReadData.getDoubleValue("Enter Expected Fees"));
	    
	    session.save(tr); 
	    session.getTransaction().commit();
	    Transaction transaction =  session.beginTransaction();
	    
	    System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("---------------------------------------Trainer Registered Succesfully-------------------------------");
        
	    System.out.println("-----------Select an Option to continue----------");
		System.out.println("0. Login");
		System.out.println("1. Go Back To Main Menu");
		System.out.println("2. Exit");
		System.out.println("----------------------------------------------------------------------------------------------------");
		int choice = ReadData.getIntegerValue("choice");
		switch(choice) {
		case 0 :
			TrainerLoginController.login(session);
			break;
		case 1: 
			App.main(null);
			break;
		case 2:
			System.exit(0);
		default:
			System.out.println("Please choose a correct option!!");
			break;
		}
	       
	}
	
}
