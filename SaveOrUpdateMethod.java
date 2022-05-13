package com.edubridge.hibernate.valuetype;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveOrUpdateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=UserSession.getSession();
		Transaction t=session.beginTransaction();
		UserDetails userDetails=new UserDetails();
		userDetails.setPhone("9446438880");
		userDetails.setUserId(1);
		userDetails.setUserName("Dhaaru");
		userDetails.setDob(new Date());
		session.saveOrUpdate(userDetails);
		userDetails.setUserName("Shalu");
		t.commit();
		System.out.println("Updated Successfully");
		session.close();
		

	}

}
