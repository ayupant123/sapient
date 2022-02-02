package com.tms.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tms.beans.Trainer;

/**
 * @author Ayushi Pant
 * @see
 * @since
 * @version
 */
public class TrainerRegistrationController {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static Trainer tr =  new Trainer();
	
	public static void register() throws IOException{
     
		System.out.println("Enter Name :");
	    tr.setTrName(br.readLine());
	    
	    System.out.println("Enter years of Experience :");
	    tr.setTrYearsOfExp(br.read());
	    
	    System.out.println("Enter Area of Expertise :");
	    tr.setTrAreaOfExpertise(br.readLine());
	    
	    System.out.println("Enter Email :");
	    tr.setTrEmail(br.readLine());
	    
	    System.out.println("Enter Password :");
	    tr.setTrPassword(br.readLine());
	    
	    System.out.println("Enter Mobile Number :");
	    tr.setTrMobileNo(br.read());
	    
	    System.out.println("Enter Mailing Address :");
	    tr.setTrMailingAddress(br.readLine());
	    
	    System.out.println("Number of Companies Trained");
	    tr.setCompaniesTrained(br.read());
	    
	    System.out.println("Enter Expected Fees");
	    tr.setTrExpectedFees(br.read());
}
}
