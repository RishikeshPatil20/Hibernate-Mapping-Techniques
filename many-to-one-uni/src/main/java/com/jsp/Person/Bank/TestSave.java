package com.jsp.Person.Bank;

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
	person.setName("sham");
	person.setEmail("sham@gmail.com");
	person.setContact(9875521);
	person.setGender("male");
	
	BankAccount bankAccount1=new BankAccount();
	bankAccount1.setAcNo(9874512);
	bankAccount1.setAcName("pnb");
	bankAccount1.setIfsc_code("SBI98756");
	
	BankAccount bankAccount2=new BankAccount();
	bankAccount2.setAcNo(9874512);
	bankAccount2.setAcName("hdfc");
	bankAccount2.setIfsc_code("SBI98756");
	
	BankAccount bankAccount3=new BankAccount();
	bankAccount3.setAcNo(9874512);
	bankAccount3.setAcName("SBI");
	bankAccount3.setIfsc_code("SBI98756");
	
	//to set one person to many bank account
	bankAccount1.setPerson(person);
	bankAccount2.setPerson(person);
	bankAccount3.setPerson(person);
	
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(bankAccount1);
	entityManager.persist(bankAccount2);
	entityManager.persist(bankAccount3);
	entityTransaction.commit();
	

}
}
