package com.CMS.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CMS.bean.Students;
import com.CMS.bean.User;
import com.CMS.service.StudentLoginService;

/**
 * Servlet implementation class StudentLoginController
 */
@WebServlet("/StudentLoginController")
public class StudentLoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String uName=request.getParameter("uName");
		String uPass=request.getParameter("uPass");
		Students student=new Students(uName,uPass);
		StudentLoginService service=new StudentLoginService();
		try {
			if(service.validateStudent(student))
			{
				RequestDispatcher rd=request.getRequestDispatcher("StudentPortal.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("msg","You are not a valid student of this college");
				RequestDispatcher rd=request.getRequestDispatcher("StudentLogin.jsp");
				rd.include(request, response);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
