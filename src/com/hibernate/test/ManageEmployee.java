package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiernate.persistence.User;

public class ManageEmployee {
	private static SessionFactory factory;   
    
	   public static void main(String[] args) {  
	      try{  
	         factory = new Configuration().configure().buildSessionFactory();  
	      }catch (Throwable ex) {   
	         System.err.println("Failed to create sessionFactory object." + ex);  
	         throw new ExceptionInInitializerError(ex);   
	      }  
	      ManageEmployee ME = new ManageEmployee();  
	  
	  
	      /*列出所有员工信息 */  
	      ME.listUsers();  
	  
	     
	   }  
	   
	   public void listUsers( ){  
		      Session session = factory.openSession();  
		      Transaction tx = null;  
		      try{  
		         tx = session.beginTransaction();  
		         List users = session.createQuery("FROM User").list();   
		         for (Iterator iterator =   
		                           users.iterator(); iterator.hasNext();){  
		            User user= (User) iterator.next();   
		            System.out.print(user.getUserName()+"  ");   
		            System.out.print(user.getPwd()+"  ");
		         }  
		         tx.commit();  
		      }catch (HibernateException e) {  
		         if (tx!=null) tx.rollback();  
		         e.printStackTrace();   
		      }finally {  
		         session.close();   
		      }  
		   }  

}
