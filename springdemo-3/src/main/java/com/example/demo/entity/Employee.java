package com.example.demo.entity;

	import javax.persistence.Column;
import javax.persistence.Entity;
	import javax.persistence.EntityListeners;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//making an entity of required table
	@Entity
	@Table(name="employee")

	public class Employee {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		
		@Column(name="first_name")
		private String firstName;
		@Column(name="last_name")
		private String lastName;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}

	
}
