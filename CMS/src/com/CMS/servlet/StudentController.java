package com.CMS.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.CMS.bean.Students;

import com.CMS.dao.StudentDAO;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		StudentDAO dao=new StudentDAO();
		List<Students> st=dao.getStudentDetails();

		session.setAttribute("stu",st);
		RequestDispatcher rd=request.getRequestDispatcher("DisplayStudent.jsp");
		rd.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		int sId=Integer.parseInt(request.getParameter("sId"));
		String sName=request.getParameter("sName");
		String gender=request.getParameter("gender");
		
		String dob=request.getParameter("dob");
		Date d=null;
		try {
			d = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		

		String stream=request.getParameter("stream");
		String email=request.getParameter("email");
		long contact=Long.parseLong(request.getParameter("contact"));
		
	
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		Students students=new Students(sId,sName,gender,d,stream,email,contact,username,password);
		StudentDAO dao=new StudentDAO();
		int result=dao.insertStudentData(students);
		if(result!=0)
		{
			request.setAttribute("msg","Student added");
			RequestDispatcher rd=request.getRequestDispatcher("AddStudent.jsp");
			rd.include(request, response);		
		}
		else
		{
			request.setAttribute("msg","Student already exists");
			RequestDispatcher rd=request.getRequestDispatcher("AddStudent.jsp");
			rd.include(request, response);
		}
		
	}

}
