package com.CMS.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CMS.bean.Staff;
import com.CMS.dao.StaffDAO;

/**
 * Servlet implementation class StaffController
 */
@WebServlet("/StaffController")
public class StaffController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		StaffDAO dao=new StaffDAO();
		List<Staff> staff=dao.getStaffDetails();

		session.setAttribute("shh",staff);
		RequestDispatcher rd=request.getRequestDispatcher("DisplayStaff.jsp");
		rd.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int staffId=Integer.parseInt(request.getParameter("staffId"));
		String staffName=request.getParameter("staffName");
		
		double salary =Double.parseDouble(request.getParameter("salary"));
		String staffUsername=request.getParameter("staffUsername");
		String staffPassword=request.getParameter("staffPassword");
		String depName=request.getParameter("deptName");
	   
		
		Staff s=new Staff(staffId,staffName, salary,staffUsername,staffPassword,depName);
		StaffDAO dao=new StaffDAO();
		int result=dao.insertStaffData(s);
		if(result!=0)
		{
			request.setAttribute("msg","Staff added");
			RequestDispatcher rd=request.getRequestDispatcher("AddStaff.jsp");
			rd.include(request, response);
		}
		else
		{
			request.setAttribute("msg","Staff already exists");
			RequestDispatcher rd=request.getRequestDispatcher("AddStaff.jsp");
			rd.include(request, response);
		}
	}

}
