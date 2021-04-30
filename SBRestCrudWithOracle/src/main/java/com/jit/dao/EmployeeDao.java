package com.jit.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jit.model.Employee;
@Repository
public class EmployeeDao {
	@Autowired
	private EntityManager em;
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployeeData(){
		return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getEmpCompensationByName(String input){
		return em.createNamedStoredProcedureQuery("secondProcedure")
				.setParameter("employee_name", input)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeeMaxSalayByRowNum() {
		return em.createNamedStoredProcedureQuery("thirdProcedure").getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees_Records_By_Id(Integer input) {
	return em.createNamedStoredProcedureQuery("fourProcedure")
				.setParameter("in_employee_id",input).getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> deleteEmployees_Records_By_Id(Integer input) {
	return em.createNamedStoredProcedureQuery("fiveProcedure")
				.setParameter("empleaveid",input).getResultList();
	}
}
