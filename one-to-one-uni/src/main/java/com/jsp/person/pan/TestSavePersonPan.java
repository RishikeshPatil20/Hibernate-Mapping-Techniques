package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("Rishi");
		
		EntityManager entityManager=
				entityManagerFactory.createEntityManager();//CRUD
		
		EntityTransaction entityTransaction=
				entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("Harry");
		person.setCno(98745125632l);
		person.setEmail("harry@mail.com");
		
		Pancard pan=new Pancard();
		pan.setAddress("Mumbai");
		
		pan.setPerson(person);//to set value in person_id in pan table in database
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
		
	}

}
