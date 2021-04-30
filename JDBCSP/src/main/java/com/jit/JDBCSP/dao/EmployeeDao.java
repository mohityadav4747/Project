package com.jit.JDBCSP.dao;

import java.util.List;

import com.jit.JDBCSP.model.Employee;

public interface EmployeeDao extends Dao<Employee>  {
    List<Employee> getAllEmployees();
}