package com.jit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jit.dao.EmployeeDao;
import com.jit.model.Employee;
@RestController
@RequestMapping("employee")
public class EmployeeRestController {
	@Autowired
	private EmployeeDao dao;
	@RequestMapping("/data")
	public List<Employee> getAllData(){
		return dao.getAllEmployeeData();
	}
	@RequestMapping("/CompByName/{employee_name}")
	public List<Employee> getEmployeeCompensation(@PathVariable String employee_name){
		return dao.getEmpCompensationByName(employee_name);
	}
	@RequestMapping("/SalaryByRowNum")
	public List<Employee> getEmployeeTopSalay(){
		return dao.getEmployeeMaxSalayByRowNum();
	}
	
	@RequestMapping("/getEmployeeById/{employee_id}")
	public List<Employee> saveEmployee(@PathVariable Integer employee_id){
		return dao.getEmployees_Records_By_Id(employee_id);
	}
	@RequestMapping("/deleteEmployeeById/{EMPLEAVE_ID}")
	public List<Employee> deleteEmployee(@PathVariable Integer EMPLEAVE_ID){
		return dao.deleteEmployees_Records_By_Id(EMPLEAVE_ID);
	}
//	@RequestMapping("/postEmployeeData/{employee}")
//	public List<Employee> saveEmployee(@Param(value = "employee") Employee employee){
//		return dao.saveEmployeeDetails();
//	}
}