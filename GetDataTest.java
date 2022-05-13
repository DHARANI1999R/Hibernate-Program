package com.edubridge.hibernate.valuetype;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class GetDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Session session=UserSession.getSession();
		    Transaction t=session.beginTransaction(); 
		    
		    UserDetails userDetails=session.load(UserDetails.class,1);
		    System.out.println(userDetails);
		   // t.commit();
		    //session.close();
		    //Session session1=UserSession.getSession();
		    UserDetails userDetails1=session.get(UserDetails.class,1);
		    System.out.println(userDetails1);
		    t.commit();
		    session.close();
		    }catch(Exception ex)
		    {
		    	System.out.println(ex.getMessage());
		    }
		   /* System.out.println(userDetails.getUserName());
		    System.out.println(userDetails.getPhone());
		    System.out.println(userDetails.getDob());
		    System.out.println(userDetails.getAddress().getCity());
		    System.out.println(userDetails.getAddress().getState());
		    System.out.println(userDetails.getAddress().getPincode());*/
		    
		  /*  System.out.println("getting data through get method ******");
		    UserDetails userDetails1= session.get(UserDetails.class, 2);
		    System.out.println(userDetails1);*/
		   /* System.out.println(userDetails.getUserName());
		    System.out.println(userDetails.getPhone());
		    System.out.println(userDetails.getDob());
		    System.out.println(userDetails.getAddress().getCity());
		    System.out.println(userDetails.getAddress().getState());
		    System.out.println(userDetails.getAddress().getPincode());*/
		    
		   /* t.commit();
		    session.close();*/
		}

	

}
