package com.jit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeCompensation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer compensation_Id;
	@JoinColumn
	private Integer employee_Id;       
	private Double max_payment;     
	private Double variable_payment;
	private Double low_payment;      
	private String payment_Id;      
	private Date payment_Date;
	public Integer getCompensation_Id() {
		return compensation_Id;
	}
	public void setCompensation_Id(Integer compensation_Id) {
		this.compensation_Id = compensation_Id;
	}
	public Integer getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(Integer employee_Id) {
		this.employee_Id = employee_Id;
	}
	public Double getMax_payment() {
		return max_payment;
	}
	public void setMax_payment(Double max_payment) {
		this.max_payment = max_payment;
	}
	public Double getVariable_payment() {
		return variable_payment;
	}
	public void setVariable_payment(Double variable_payment) {
		this.variable_payment = variable_payment;
	}
	public Double getLow_payment() {
		return low_payment;
	}
	public void setLow_payment(Double low_payment) {
		this.low_payment = low_payment;
	}
	public String getPayment_Id() {
		return payment_Id;
	}
	public void setPayment_Id(String payment_Id) {
		this.payment_Id = payment_Id;
	}
	public Date getPayment_Date() {
		return payment_Date;
	}
	public void setPayment_Date(Date payment_Date) {
		this.payment_Date = payment_Date;
	}
	 
}
