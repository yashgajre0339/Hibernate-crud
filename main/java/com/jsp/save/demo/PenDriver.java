package com.jsp.save.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PenDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("yash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Pen p1=new Pen();
		p1.setName("trimax");
		p1.setBrand("gold");
		p1.setColour("rainbow");
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityTransaction.commit();
		
		
	}

}
