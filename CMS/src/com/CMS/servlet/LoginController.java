package com.CMS.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CMS.bean.User;
import com.CMS.service.AccountantLoginService;
import com.CMS.service.AdminLoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uName=request.getParameter("uName");
		String uPass=request.getParameter("uPass");
		User user=new User(uName,uPass);
		if(user.getuName().equals("admin"))
		{
			AdminLoginService service=new AdminLoginService();
			boolean is=service.isValidate(user);
			if(is==true)
			{
				RequestDispatcher rd=request.getRequestDispatcher("/AdminView.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("msg","You are an invalid user");
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);
			}
		} 
		else if(user.getuName().equals("accountant"))
		{
			AccountantLoginService service=new AccountantLoginService();
			boolean is=service.isValidate(user);
			if(is==true)
			{
				RequestDispatcher rd=request.getRequestDispatcher("/AccountantPortal.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("msg","You are an invalid user");
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);
			}
		}
		else
		{
			request.setAttribute("msg","You are an invalid user");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
	}

}
