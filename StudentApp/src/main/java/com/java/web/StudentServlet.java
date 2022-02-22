package com.java.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dto.StudentDTO;
import com.java.service.StudentService;
import com.java.vo.StudentVo;

public class StudentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//general setting
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		//read form data..
		int no = Integer.parseInt(req.getParameter("rno"));
		String name=req.getParameter("name");
		
		int marks= Integer.parseInt(req.getParameter("m1"));
		
		// create vo class object
	   StudentVo  vo= new StudentVo(no,name,marks);
	   
	   //convert  VO class obj to DTO class Object
	   
	   StudentDTO dto = new StudentDTO(vo.getRno(),vo.getName(),vo.getMarks());
		
	   //use service class usiness logic
	   StudentService ser = new StudentService();
	   
	   String result = ser.generateResult(dto);
	   
	   //present the result
	   
	   pw.println("<h2>Student result is "+result);
	   
	   pw.close();
		
	}
}
