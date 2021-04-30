package com.jit.JDBCSP;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jit.JDBCSP.dao.EmployeeBean;
    @Configuration
	@ComponentScan
	public class App {
	    public static void main(String[] args) {
	        AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(App.class);
	        context.getBean(EmployeeBean.class).run();
	    }
	    @Bean
	    public DataSource dataSource() {
	    	DriverManagerDataSource ds = new DriverManagerDataSource();
	    	ds.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
	    	ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	    	ds.setUsername("system");
	    	ds.setPassword("system");
	    	return ds;
	    }
	}