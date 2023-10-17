package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager=
				entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=
				entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("HAppy");
		person.setCno(1459799366664854l);
		
		Pancard pan=new Pancard();
		pan.setAdresss("mumbai");
		
		pan.setPerson(person);
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();

	}

}
