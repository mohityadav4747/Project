package com.jit.JDBCSP.model;

import java.util.Date;

public class EmployeeCompensation {
	private Integer EMPCOMPENSATION_ID  ;                      
	 private Integer EMPLOYEE_ID ;                     
	private Integer MAX_PAYMENT  ;                    
	private Integer  VARIABLE_PAYMENT ;                   
	private Date PAYMENT_DATE;                     
	 private Integer LOW_BALANCE;                    
	 private String PAYMENT_ID;                   
	 private Integer LOW_PAYMENT;
	public EmployeeCompensation() {
		super();
	}
	public EmployeeCompensation(Integer eMPCOMPENSATION_ID, Integer eMPLOYEE_ID, Integer mAX_PAYMENT,
			Integer vARIABLE_PAYMENT, Date pAYMENT_DATE, Integer lOW_BALANCE, String pAYMENT_ID, Integer lOW_PAYMENT) {
		super();
		EMPCOMPENSATION_ID = eMPCOMPENSATION_ID;
		EMPLOYEE_ID = eMPLOYEE_ID;
		MAX_PAYMENT = mAX_PAYMENT;
		VARIABLE_PAYMENT = vARIABLE_PAYMENT;
		PAYMENT_DATE = pAYMENT_DATE;
		LOW_BALANCE = lOW_BALANCE;
		PAYMENT_ID = pAYMENT_ID;
		LOW_PAYMENT = lOW_PAYMENT;
	}
	public Integer getEMPCOMPENSATION_ID() {
		return EMPCOMPENSATION_ID;
	}
	public void setEMPCOMPENSATION_ID(Integer eMPCOMPENSATION_ID) {
		EMPCOMPENSATION_ID = eMPCOMPENSATION_ID;
	}
	public Integer getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(Integer eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public Integer getMAX_PAYMENT() {
		return MAX_PAYMENT;
	}
	public void setMAX_PAYMENT(Integer mAX_PAYMENT) {
		MAX_PAYMENT = mAX_PAYMENT;
	}
	public Integer getVARIABLE_PAYMENT() {
		return VARIABLE_PAYMENT;
	}
	public void setVARIABLE_PAYMENT(Integer vARIABLE_PAYMENT) {
		VARIABLE_PAYMENT = vARIABLE_PAYMENT;
	}
	public Date getPAYMENT_DATE() {
		return PAYMENT_DATE;
	}
	public void setPAYMENT_DATE(Date pAYMENT_DATE) {
		PAYMENT_DATE = pAYMENT_DATE;
	}
	public Integer getLOW_BALANCE() {
		return LOW_BALANCE;
	}
	public void setLOW_BALANCE(Integer lOW_BALANCE) {
		LOW_BALANCE = lOW_BALANCE;
	}
	public String getPAYMENT_ID() {
		return PAYMENT_ID;
	}
	public void setPAYMENT_ID(String pAYMENT_ID) {
		PAYMENT_ID = pAYMENT_ID;
	}
	public Integer getLOW_PAYMENT() {
		return LOW_PAYMENT;
	}
	public void setLOW_PAYMENT(Integer lOW_PAYMENT) {
		LOW_PAYMENT = lOW_PAYMENT;
	}
	@Override
	public String toString() {
		return "EmployeeCompensation [EMPCOMPENSATION_ID=" + EMPCOMPENSATION_ID + ", EMPLOYEE_ID=" + EMPLOYEE_ID
				+ ", MAX_PAYMENT=" + MAX_PAYMENT + ", VARIABLE_PAYMENT=" + VARIABLE_PAYMENT + ", PAYMENT_DATE="
				+ PAYMENT_DATE + ", LOW_BALANCE=" + LOW_BALANCE + ", PAYMENT_ID=" + PAYMENT_ID + ", LOW_PAYMENT="
				+ LOW_PAYMENT + "]";
	}
	 
	 }
