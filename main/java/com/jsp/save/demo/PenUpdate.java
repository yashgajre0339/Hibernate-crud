package com.jsp.save.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PenUpdate {
	
		public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("yash");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction= entityManager.getTransaction();
			
			Pen p= entityManager.find(Pen.class, 4);
			p.setName("Matrix");
			
            entityTransaction.begin();
            entityManager.merge(p);
            entityTransaction.commit();
			
			
		}
			
}
			
			


