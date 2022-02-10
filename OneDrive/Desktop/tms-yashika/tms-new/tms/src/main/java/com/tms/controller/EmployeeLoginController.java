package com.tms.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.pages.EmployeeDashboard;
import com.tms.beans.EmployeeBeans;
import com.tms.util.ReadData;

public class EmployeeLoginController {
public static void login(Session session) throws IOException {
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("-----------------Employee Login------------------");
		EmployeeBeans employee = new EmployeeBeans(); 
		employee.setEmpEmail(ReadData.getStringValue("Email Id -> "));
		employee.setEmpPassword(ReadData.getStringValue("Password -> "));
		
	
			
		
		checkUser(session, employee);
		
		//After Login
		//Dashboard.Menu();
		
		
	}
	
	
	
	private static void checkUser(Session session, EmployeeBeans employee) throws IOException {
		
		int flag=0;
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		
		CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
		Root<EmployeeBeans> root = query.from(EmployeeBeans.class);
		
		
		query.multiselect(root.get("empEmail"), root.get("empPassword"), root.get("empName")); 
		 List<Object[]> resultList = session.createQuery(query).getResultList(); 
		 
		 for(Object [] temp : resultList) {
				if(temp[0].equals(employee.getEmpEmail()) && temp[1].equals(employee.getEmpPassword())) {
					System.out.println();
					System.out.println("Logged in!");
					EmployeeDashboard.Menu(temp[2],session);
					flag=1;
				}
					
			}
		 if(flag==0) 
		 {
			 System.out.println("Invalid Email id or Password!!");
		 }
		
		 
	}
}
