package com.app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Date;

import oracle.jdbc.OracleTypes;

public class InsertRecordsSPEmpLeave {

	public static void main(String[] args){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			CallableStatement cstmt=
			con.prepareCall("{call insert_Records_into_employee_leave(?,?,?,?,?,?)}");
			
			cstmt.setInt(1,26);
			cstmt.setInt(2,22);
			cstmt.setDate(3, java.sql.Date.valueOf("2021-01-09"));
			cstmt.setDate(4, java.sql.Date.valueOf("2020-01-27"));
			cstmt.setDate(5, java.sql.Date.valueOf("2020-12-09"));
			cstmt.setInt(6,23);
			
//			cstmt.registerOutParameter(1,Types.INTEGER);
//			cstmt.registerOutParameter(2,Types.INTEGER);
//			cstmt.registerOutParameter(3,Types.DATE);
//			cstmt.registerOutParameter(4,Types.DATE);
//			cstmt.registerOutParameter(5,Types.DATE);
//			cstmt.registerOutParameter(6,Types.INTEGER);
//		
	// EMPLOYEE_ID, LEAVE_START_DT, LEAVEAPPLY_DT, LEAVEEND_DT, MAX_LEAVE
			cstmt.execute();
			ResultSet rs=(ResultSet) cstmt.getObject(6);
			boolean flag=false;
			if(flag==true) {
				System.out.println("success");
			}else {
				System.out.println("fail");
			}
		    cstmt.close();
			con.close();
		} catch (Exception e) {
          e.printStackTrace();
		}
	}

}
