package com.nagarro.HibernateAssignment.HibernateProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	System.out.println(sf);
    }
}
