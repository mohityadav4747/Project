package com.jit.model;
import java.util.Date;

public class Employee {
	private Integer  employee_id ;                           
	private String designation;                                     
	 private String email      ;                                        
	 private String employee_name  ;                                  
	 private Date joining_date ;                                     
	 private String location ;                                       
	 private String contact;
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
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
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public Date getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
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
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", designation=" + designation + ", email=" + email
				+ ", employee_name=" + employee_name + ", joining_date=" + joining_date + ", location=" + location
				+ ", contact=" + contact + "]";
	}
	

}
