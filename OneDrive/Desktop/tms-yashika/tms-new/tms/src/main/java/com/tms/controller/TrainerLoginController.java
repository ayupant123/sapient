package com.tms.controller;

/**
 * @author Ayushi Pant
 * @see Trainer login controller class
 * @since Jan2022
 */

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.pages.Dashboard;
//import com.mysql.cj.Query;
import com.tms.beans.TrainerLogin;
import com.tms.beans.TrainerRegistration;



public class TrainerLoginController {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void login(Session session) throws IOException {
		
         CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		// return type 
		CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
		Root<TrainerRegistration> root = query.from(TrainerRegistration.class);
		
        
        
		TrainerLogin tl =  new TrainerLogin();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------Welcome To Trainer Login Module-------------------------------------------------------------------");
		System.out.println("-----------------------------Please Enter Your Login Details-------------------------------------------------------------------");
		
		
		 boolean flag = false;
		 while(flag==false) {
			 System.out.println("Enter UserName: ");
				tl.setUserName(br.readLine());
				
				System.out.println("Enter Password: ");
				tl.setPassword(br.readLine());
				
				query.multiselect(root.get("trName"), root.get("trPassword"));
				
				List<Object[]> resultList = session.createQuery(query).getResultList(); 
				
				for(Object [] temp : resultList) {
					
					if(tl.getUserName().equals(temp[0]) && tl.getPassword().equals(temp[1])){
						//from here just redirect the user to dashboard
						System.out.println("-----------------------------------------------------------------------------------------------");
						System.out.println("-----------------------------------------------------------------------------------------------");
					   flag=true;
					}
				}
				if(!flag) {
					System.out.println("Invalid Username or password");
				}
				else Dashboard.dashboard(session , tl.getUserName());
				

			
			
		 }
			
		
	}
}
