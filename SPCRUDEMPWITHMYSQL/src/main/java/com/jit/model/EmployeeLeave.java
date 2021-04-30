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
public class EmployeeLeave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empleave_Id; 
	@JoinColumn
	private Integer employee_Id ;
	private Date leaveStart_Dt;
	 private Date leaveend_Dt  ;
	private Date leaveapply_Dt;
	private Integer max_Leave;
	public Integer getEmpleave_Id() {
		return empleave_Id;
	}
	public void setEmpleave_Id(Integer empleave_Id) {
		this.empleave_Id = empleave_Id;
	}
	public Integer getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(Integer employee_Id) {
		this.employee_Id = employee_Id;
	}
	public Date getLeaveStart_Dt() {
		return leaveStart_Dt;
	}
	public void setLeaveStart_Dt(Date leaveStart_Dt) {
		this.leaveStart_Dt = leaveStart_Dt;
	}
	public Date getLeaveend_Dt() {
		return leaveend_Dt;
	}
	public void setLeaveend_Dt(Date leaveend_Dt) {
		this.leaveend_Dt = leaveend_Dt;
	}
	public Date getLeaveapply_Dt() {
		return leaveapply_Dt;
	}
	public void setLeaveapply_Dt(Date leaveapply_Dt) {
		this.leaveapply_Dt = leaveapply_Dt;
	}
	public Integer getMax_Leave() {
		return max_Leave;
	}
	public void setMax_Leave(Integer max_Leave) {
		this.max_Leave = max_Leave;
	}
	  
}
