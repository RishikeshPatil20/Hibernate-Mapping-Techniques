package com.jsp.person.pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		private String name;
		private long cno;
		@OneToOne
		private Pancard pan;
		
		public Pancard getPan() {
			return pan;
		}
		public void setPan(Pancard pan) {
			this.pan = pan;
		}
		public int getId() {
		return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getCno() {
			return cno;
		}
		public void setCno(long cno) {
			this.cno = cno;
		}
		
	
}
