package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.java.bo.StudentBO;

public class StudentDAO {

	private static final String STUDENT_INSERT_QUERY="INSERT INTO STUDENT2 VALUES(?,?,?)";
	Connection con;
	
	public int insert(StudentBO bo) {
		
		try {
			//get connnection from jdbc 
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			 
			 //create a prepare statement
			PreparedStatement ps = con.prepareStatement(STUDENT_INSERT_QUERY);
			ps.setInt(1, bo.getRno());
			ps.setString(2,bo.getName());
			ps.setInt(3, bo.getMarks());
			
			int result = ps.executeUpdate();
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	
		
	}
}
