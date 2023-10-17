package com.jsp.person.bank;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("Rishi");
		
		EntityManager entityManager=
				entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=
				entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("ABC");
		person.setEmail("ABC@gmail.com");
		person.setCno(98745);
		
		Account account1=new Account();
		account1.setAcNo(987452236l);
		account1.setBankName("hdfc");
		account1.setIfsc_code("SBI789654");
		
		Account account2=new Account();
		account2.setAcNo(987452236l);
		account2.setBankName("icic");
		account2.setIfsc_code("SBI789654");
		
		Account account3=new Account();
		account3.setAcNo(987452236l);
		account3.setBankName("pnb");
		account3.setIfsc_code("SBI789654");
		
		List<Account> account=new ArrayList<>();
		account.add(account1);
		account.add(account2);
		account.add(account3);
		
		//set person with multiple bank account 
		person.setAccount(account);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityManager.persist(account3);
		entityTransaction.commit();
		
	}

}
