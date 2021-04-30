package com.app;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer  employee_id ;                           
	private String employee_name;                                                                      
	private String designation;                                     
	 private String email  ;                                        
	 private String location ;                                       
	 private String contact;
	    @ElementCollection(fetch = FetchType.EAGER)
		@CollectionTable(name="roletab",joinColumns =@JoinColumn(name="employee_id"))
		@Column(name = "roles")
		private Set<String> roles;
		public Employee() {
			super();
		}
		public Integer getEmployee_id() {
			return employee_id;
		}
		public void setEmployee_id(Integer employee_id) {
			this.employee_id = employee_id;
		}
		public String getEmployee_name() {
			return employee_name;
		}
		public void setEmployee_name(String employee_name) {
			this.employee_name = employee_name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public Set<String> getRoles() {
			return roles;
		}
		public void setRoles(Set<String> roles) {
			this.roles = roles;
		}
		@Override
		public String toString() {
			return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", designation="
					+ designation + ", email=" + email + ", location=" + location + ", contact=" + contact + ", roles="
					+ roles + "]";
		}
		
	
}
