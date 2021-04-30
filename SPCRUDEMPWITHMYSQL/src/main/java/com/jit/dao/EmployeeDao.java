package com.jit.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jit.model.Employee;
@Repository
public class EmployeeDao {
	@Autowired
	private EntityManager em;
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployeeData(){
		return em.createNamedStoredProcedureQuery("firstProcedure")
				.getResultList();
	}
	@SuppressWarnings("unchecked")

	public List<Employee> getEmpCompensationByName(String input){
		return em.createNamedStoredProcedureQuery("secondProcedure")
				.setParameter("in_name", input)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeeMaxSalayByRowNum() {
		return em.createNamedStoredProcedureQuery("thirdProcedure").getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getEmplLeaveDetailsByDays(String input){
		return em.createNamedStoredProcedureQuery("fourProcedure")
				.setParameter("in_max_leave", input)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getEmplDatePayLeave(String input){
		return em.createNamedStoredProcedureQuery("fiveProcedure")
				.setParameter("in_employee_id", input)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> deleteEmployeeRecords(String input){
		return em.createNamedStoredProcedureQuery("sixProcedure")
				.setParameter("in_employee_id", input)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> updateEmployeeRecords(String input){
		return em.createNamedStoredProcedureQuery("sevenProcedure")
				.setParameter("in_employee_id", input)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> insertEmployeeRecords(String input){
		return em.createNamedStoredProcedureQuery("eightProcedure")
				.setParameter("out_name", input).setParameter("out_contact", input)
				.setParameter("out_desig", input).setParameter("out_email", input)
				.setParameter("out_location", input).setParameter("out_jdate", input)
				.getResultList();
	}
}
