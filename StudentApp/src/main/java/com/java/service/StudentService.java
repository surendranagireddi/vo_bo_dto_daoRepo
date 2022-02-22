package com.java.service;

import com.java.bo.StudentBO;
import com.java.dao.StudentDAO;
import com.java.dto.StudentDTO;

public class StudentService {
	
	public String generateResult(StudentDTO dto) {
		
		//write business logic
		int  total=dto.getMarks();
		String result = null;
		if(total<=55) {
			result = "fail";
		}
		else {
			result = "pass";
		}
			
		//prepare Bo Object having persistance data
		StudentBO bo = new StudentBO(dto.getRno(),dto.getName(),dto.getMarks(),total,result);
		
		//create service class Object
		
		StudentDAO dao = new StudentDAO();
		
		int status =dao.insert(bo);
		
		if(status == 0) {
			return "student registration failed";
		}else {
			return "student registration sucess with :"+dto.getRno();
		}
		
	
		
	} // generate result

}
