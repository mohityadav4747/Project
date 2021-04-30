package com.jit.model;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="firstProcedure",
	procedureName="getEmployeesDetails"),
	
	@NamedStoredProcedureQuery(name="secondProcedure",
	procedureName="getEmployees_Payment_By_Name",parameters =
    {@StoredProcedureParameter(mode=ParameterMode.IN,name =
    "in_name",type = String.class)}),
	
    @NamedStoredProcedureQuery(name="thirdProcedure",
    procedureName="fetchEmployeesPaymentById"),
    
    @NamedStoredProcedureQuery(name="fourProcedure",
	procedureName="getEmployees_leave_Details_By_No_Of_Days",parameters =
    {@StoredProcedureParameter(mode=ParameterMode.IN,name =
    "in_max_leave",type = String.class)}),
    
	@NamedStoredProcedureQuery(name="fiveProcedure",
	procedureName="getEmployees_Date_pay_leave",parameters =
    {@StoredProcedureParameter(mode=ParameterMode.IN,name =
    "in_employee_id",type = String.class)}),
	@NamedStoredProcedureQuery(name="sixProcedure",
	procedureName="Delete_Employees_Records_ById",parameters =
    {@StoredProcedureParameter(mode=ParameterMode.IN,name =
    "in_employee_id",type = String.class)}),
	
	@NamedStoredProcedureQuery(name="sevenProcedure",
	procedureName="Update_Employees_Records_ById",parameters =
    {@StoredProcedureParameter(mode=ParameterMode.IN,name =
    "in_employee_id",type = String.class)}),
	
	@NamedStoredProcedureQuery(name="eightProcedure",
	procedureName="Insert_Employees_Records",parameters =
    {@StoredProcedureParameter(mode=ParameterMode.IN,name =
    "out_name",type = String.class)})
   })

public class Employee{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer employeeId;
private String employeeName;
private String email;
private String contact;
private String designation;
private String location;
private Date joiningDate;
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Date getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(Date joiningDate) {
	this.joiningDate = joiningDate;
}

}
