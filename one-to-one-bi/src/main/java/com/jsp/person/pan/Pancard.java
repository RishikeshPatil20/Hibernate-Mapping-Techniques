package com.jsp.person.pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		private String adresss;
		@OneToOne
		private Person person;
		
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAdresss() {
			return adresss;
		}
		public void setAdresss(String adresss) {
			this.adresss = adresss;
		}
		
}
