package com.app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

public class StoredProcBySal {
		public static void main(String[] args){
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				CallableStatement cstmt=con.prepareCall("{call GetEmployeeBySal(?,?)}");
				
				cstmt.setInt(1,20000);
				
				cstmt.registerOutParameter(2,OracleTypes.CURSOR);
				cstmt.execute();
				ResultSet rs=(ResultSet) cstmt.getObject(2);
				boolean flag=false;
				System.out.println("name   desig    payment");
				while(rs.next()) {
					flag=true;
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "
				    +" "+rs.getInt(3)+""
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
