package com.app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {  
	@Autowired
private JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public Integer save(Employee p){    
    String sql="insert into Employee"
    		+ "(employee_id,employee_name,designation,email,location,contact)"
    		+ " values('"+p.getEmployee_id()+"','"+p.getEmployee_name()+"'"
    				+ ",'"+p.getDesignation()+"',"
    						+ "'"+p.getEmail()+"','"+p.getLocation()+"','"+p.getContact()+"')";    
    return template.update(sql);
}    
public Integer update(Employee p){    
    String sql="update Employee set employee_name='"+p.getEmployee_name()+"',"
    		+ " email='"+p.getEmail()+"',"
    				+ "designation='"+p.getDesignation()+"',"
    						+ " contact='"+p.getContact()+"',"
    								+ " location='"+p.getLocation()+"',"
    						+ " where employee_id="+p.getEmployee_id()+"";    
    return template.update(sql);    
}    
public Integer delete(Integer employee_id){    
    String sql="delete from Employee where employee_id="+employee_id+"";    
    return template.update(sql);    
}    
public Employee getEmpById(Integer employee_id)
{    
    String sql="select * from Employee where employee_id=?";    
    return template.queryForObject(sql, new Object[]{employee_id},
    		new BeanPropertyRowMapper<Employee>(Employee.class));    
}    
public List<Employee> getEmployees(){    
    return template.query("select * from Employee",new RowMapper<Employee>(){    
        public Employee mapRow(ResultSet rs,int row) throws SQLException {    
            Employee e=new Employee();    
            e.setEmployee_id(rs.getInt(1));    
            e.setEmployee_name(rs.getString(2));    
            e.setDesignation(rs.getString(3));    
            e.setEmail(rs.getString(4));
            e.setContact(rs.getString(5));
            e.setLocation(rs.getString(6));
            return e;    
        }

		    });    
}    
}   