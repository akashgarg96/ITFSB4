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

import com.CMS.bean.Staff;
import com.CMS.bean.User;
import com.CMS.service.StaffLoginService;

/**
 * Servlet implementation class StaffLoginController
 */
@WebServlet("/StaffLoginController")
public class StaffLoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uName=request.getParameter("uName");
		String uPass=request.getParameter("uPass");
		Staff staff=new Staff(uName,uPass);
		StaffLoginService service=new StaffLoginService();
		try {
			if(service.validateStaff(staff))
			{
				RequestDispatcher rd=request.getRequestDispatcher("StaffPortal.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("msg","You are not a valid staff of this college");
				RequestDispatcher rd=request.getRequestDispatcher("StaffLogin.jsp");
				rd.include(request, response);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
