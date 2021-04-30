package com.jit.JDBCSP.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.jit.JDBCSP.model.Employee;
import com.jit.JDBCSP.model.EmployeeCompensation;
import com.jit.JDBCSP.model.EmployeeLeave;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall simpleJdbcCall;

    @PostConstruct
    private void postConstruct() {
        jdbcTemplate = new JdbcTemplate(dataSource);
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("GetEmployeeDetails")
                .returningResultSet("result",
                        BeanPropertyRowMapper.newInstance(Employee.class));
    }
    
    @PostConstruct
    private void postConstruct2() {
        jdbcTemplate = new JdbcTemplate(dataSource);
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("GetAllEmployeesLeave")
                .returningResultSet("p_result",
                        BeanPropertyRowMapper.newInstance(EmployeeLeave.class));
    }
    @PostConstruct
    private void postConstruct3() {
        jdbcTemplate = new JdbcTemplate(dataSource);
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("GetAllEmployeesCompensation")
                .returningResultSet("p_result",
                        BeanPropertyRowMapper.newInstance(EmployeeCompensation.class));
    }
    
    @Override
    public List<Employee> getAllEmployees() {
    	Map<String, Object> result =
    			simpleJdbcCall.execute(new HashMap<String, Object>(0));
    	System.out.println("result: " + result);
    	return (List) result.get("p_result");
    }
//    @Override
//    public void save(Employee employee) {
//        String sql = "insert into EMPLOYEE "
//        		+ "(employee_id,employee_name,"
//        		+ "designation,email,joining_date,location,contact) values "
//        		+ "(?,?,?,?,?,?,?)";
//        jdbcTemplate.update(sql, employee.getEmployee_name(),
//                employee.getDesignation(),employee.getJoining_date(),employee.getContact(),
//                employee.getEmail(),employee.getLocation(),employee.getEmployee_id());
//    }
//
//    @Override
//    public Employee fetchById(long id) {
//        List<Employee> list = 
//        		jdbcTemplate.query("select * from EMPLOYEE where id =?",
//                new Object[]{id}, (resultSet, i) -> {
//                    return toEmployee(resultSet);
//                });
//
//        if (list.size() == 1) {
//            return list.get(0);
//        }
//        return null;
//    }

//    @Override
//    public void delete(long id) {
//        jdbcTemplate.update("delete from Employee where id = ?", id);
//    }
//
//    @Override
//    public void update(Employee employee) {
//    	String sql = "update  EMPLOYEE set employee_name=?"
//        		+ "designation=?,email=?,joining_date=?,"
//        		+ "location=?,contact=? where employee_id=?";
//        jdbcTemplate.update(sql, employee.getEmployee_name(),
//                employee.getDesignation(),
//                employee.getJoining_date(),employee.getContact(),
//                employee.getEmail(),employee.
//                getLocation(),employee.getEmployee_id());
//    }
//
//    @Override
//    public List<Employee> fetchAll() {
//        return jdbcTemplate.query("select * from Employee", (resultSet, i) -> {
//            return toEmployee(resultSet);
//        });
//    }
//
//    private Employee toEmployee(ResultSet resultSet) throws SQLException {
//        Employee em = new Employee();
//        em.setEmployee_id(resultSet.getInt("employee_id"));
//        em.setEmployee_name(resultSet.getString("employee_name"));
//        em.setDesignation(resultSet.getString("Designation"));
//        em.setContact(resultSet.getString("contact"));
//        em.setJoining_date(resultSet.getDate("joining_date"));
//        em.setLocation(resultSet.getString("location"));
//        em.setEmail(resultSet.getString("email"));
//        return em;
//    }
}