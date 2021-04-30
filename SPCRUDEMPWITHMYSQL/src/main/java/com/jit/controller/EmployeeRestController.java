package com.jit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	@RequestMapping("/Top6Salary")
	public List<Employee> getEmployeeTopSalay(){
		return dao.getEmployeeMaxSalayByRowNum();
	}
	@RequestMapping("/LeaveDetailsByNOD/{max_leave}")
	public List<Employee> getEmplLeaveDetailsByDays(@PathVariable String max_leave){
		return dao.getEmplLeaveDetailsByDays(max_leave);
	}
	@RequestMapping("/MaxPayDateAndLeave/{employee_id}")
	public List<Employee> getEmplPaymentAndLeave(@PathVariable String employee_id){
		return dao.getEmplDatePayLeave(employee_id);
	}
	@RequestMapping("/deleteEmp/{employee_id}")
	public List<Employee> deleteEmployee(@PathVariable String employee_id){
		return dao.deleteEmployeeRecords(employee_id);
	}
	@RequestMapping("/updateEmp/{employee_id}")
	public List<Employee> updateEmployee(@PathVariable String employee_id){
		return dao.updateEmployeeRecords(employee_id);
	}
	@RequestMapping("/insertEmp/{employee_name}")
	public List<Employee> insertEmployee(@PathVariable String employee_name){
		return dao.updateEmployeeRecords(employee_name);
	}
}