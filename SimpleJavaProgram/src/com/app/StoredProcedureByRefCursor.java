package com.app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;
public class StoredProcedureByRefCursor{
	public static void main(String[] args){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			CallableStatement cstmt=con.prepareCall("{call GetEmployeeDetails(?)}");
			//cstmt.setInt(1, 1200);
			cstmt.registerOutParameter(1,OracleTypes.CURSOR);
			cstmt.execute();
			ResultSet rs=(ResultSet) cstmt.getObject(1);
			boolean flag=false;
			System.out.println("Name   Desig        Email       Date    Leave_Days");
			while(rs.next()) {
				flag=true;
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "
			    +" "+rs.getString(3)+"  "
			    +rs.getDate(4)+"   "
			+rs.getInt(5)+" "
			//+rs.getDate(6)+""+rs.getString(7)+""
						);
			}
			if(flag==false) {
				System.out.println("no records");
			}
			con.close();
		} catch (Exception e) {
          e.printStackTrace();
		}
	}

}
