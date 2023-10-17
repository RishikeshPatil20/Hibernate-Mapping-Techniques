package com.jsp.Person.Bank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		private int acNo;
		private String acName;
		private String ifsc_code;
	
		@ManyToOne
		private Person person;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getAcNo() {
			return acNo;
		}

		public void setAcNo(int acNo) {
			this.acNo = acNo;
		}

		public String getAcName() {
			return acName;
		}

		public void setAcName(String acName) {
			this.acName = acName;
		}

		public String getIfsc_code() {
			return ifsc_code;
		}

		public void setIfsc_code(String ifsc_code) {
			this.ifsc_code = ifsc_code;
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}
	
	
}
