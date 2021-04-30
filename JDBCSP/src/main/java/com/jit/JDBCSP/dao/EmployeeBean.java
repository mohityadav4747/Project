package com.jit.JDBCSP.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jit.JDBCSP.model.Employee;

@Component
public class EmployeeBean {

    @Autowired
    EmployeeDao employeeDao;

    public void run() {
//        List<Employee> emp = employeeDao.fetchAll();
//        System.out.println("fetch employees: "+emp);

        List<Employee> emp1 = employeeDao.getAllEmployees();
        System.out.println("All Employee: "+emp1);
    }
    
}