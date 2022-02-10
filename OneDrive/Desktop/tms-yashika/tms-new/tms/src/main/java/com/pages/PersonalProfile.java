package com.pages;

import java.io.IOException;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.hibernate.Session;

import com.tms.beans.TrainerRegistration;

public class PersonalProfile {
	
	public static void profile(Session session, String name) throws IOException {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		CriteriaQuery<TrainerRegistration> query = criteriaBuilder.createQuery(TrainerRegistration.class);
		Root<TrainerRegistration> root = query.from(TrainerRegistration.class);
		query.select(root).where(criteriaBuilder.equal(root.get("trName"), name)); 
		
     	Query<TrainerRegistration> TrainerQuery = session.createQuery(query);
       TrainerRegistration result = TrainerQuery.getSingleResult();
       System.out.println("---------------------------------------------------------------------------------------------------------------------");
	   System.out.println("----------------------------------TRAINER PROFILE-------------------------------------------------------------------------");
       System.out.println("Name :" +result.getTrName());
	   System.out.println("Email :" + result.getTrEmail());
	   System.out.println("Area of Expertise : "+ result.getTrAreaOfExpertise());
	   System.out.println("Years of Experience : " + result.getTrYearsOfExp());
	   System.out.println("Address :" + result.getTrMailingAddress());
	   System.out.println("Expected Fees : "+ result.getTrFees());
	   System.out.println("-----------------------------------------------------------------------------------------------------------------------");
	   
	   Dashboard.dashboard(session, name);
	}

}
