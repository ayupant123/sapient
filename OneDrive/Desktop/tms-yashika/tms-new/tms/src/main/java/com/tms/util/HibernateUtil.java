package com.tms.util;

/**
 * @author Ayushi
 * @see Hibernate utility class
 * @since Jan 2022
 */

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.tms.beans.EmployeeBeans;
import com.tms.beans.TrainerRegistration;

public class HibernateUtil {

static  SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
	
		Configuration configuration = 	new Configuration().configure();
		
		configuration.addAnnotatedClass(TrainerRegistration.class);
		configuration.addAnnotatedClass(EmployeeBeans.class);
		
	ServiceRegistry serviceRegistry = 	new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

	 return configuration.buildSessionFactory(serviceRegistry);
	}
}
