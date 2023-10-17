package com.jsp.person.bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {

	public static void main(String[] args) {

		EntityManagerFactory eniEntityManagerFactory=
				Persistence.createEntityManagerFactory("Rishi");
		EntityManager entityManager=
				eniEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = 
				entityManager.getTransaction();
		
//		Person person=entityManager.find(Person.class, 1);
		Account account=entityManager.find(Account.class, 3);
		
		if(account!=null) {
			entityTransaction.begin();
			entityManager.remove(account);
			entityTransaction.commit();
		}
		else {
			System.out.println("Not Deleted");
		}
		
		
	}

}
