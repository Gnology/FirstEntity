package com.gnology.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.gnology.jpa.domain.MyThings;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myBase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		MyThings newThing = new MyThings();
		
		newThing.setName("T-Shirt");
		newThing.setAmount(10);
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
