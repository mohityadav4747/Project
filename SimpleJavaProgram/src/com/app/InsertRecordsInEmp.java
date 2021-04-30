package com.app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class InsertRecordsInEmp {

	public static void main(String[] args){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			CallableStatement cst=
			con.prepareCall("{call insert_Records_into_employee(?,?,?,?,?,?)}");
			
			cst.setString(1,"83457843");
			cst.setString(2,"Devloper");
			cst.setString(3,"allen@gmail.com");
			cst.setString(4,"Allen");
			cst.setDate(5,java.sql.Date.valueOf("2021-01-09"));
			cst.setString(6,"Navi Mumbai");
	//CONTACT,DESIGNATION,EMAIL,EMPLOYEE_NAME,JOINING_DATE,LOCATION 
			//cstmt.registerOutParameter(2,OracleTypes.CURSOR);
			cst.execute();
			ResultSet rs=(ResultSet) cst.getObject(2);
			boolean flag=false;
//			if(flag==true) {
//				System.out.println("success");
//			}else {
//				System.out.println("fail");
//			}
			con.close();
		} catch (Exception e) {
          e.printStackTrace();
		}
	}
}
