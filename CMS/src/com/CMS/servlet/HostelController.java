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

import com.CMS.bean.Hostel;
import com.CMS.dao.HostelDAO;



/**
 * Servlet implementation class HostelController
 */
@WebServlet("/HostelController")
public class HostelController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    PrintWriter out=response.getWriter();
			HostelDAO dao=new HostelDAO();
			List<Hostel> room=dao.getHostelDetails();
			HttpSession session=request.getSession();
			session.setAttribute("r", room);
			RequestDispatcher rd=request.getRequestDispatcher("DisplayHostel.jsp");
			rd.forward(request, response);
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter out=response.getWriter();
			int roomNo=Integer.parseInt(request.getParameter("roomNo"));
			String seaterType=request.getParameter("seaterType");
			String roomType=request.getParameter("roomType");
			Hostel hostel=new Hostel(roomNo,seaterType,roomType);
			HostelDAO dao=new HostelDAO();
			int result=dao.insertHostelData(hostel);
			if(result!=0)
			{
				request.setAttribute("msg","Room added");
				RequestDispatcher rd=request.getRequestDispatcher("AddHostel.jsp");
				rd.include(request, response);
			}
			else
			{
				request.setAttribute("msg","Room already exists");
				RequestDispatcher rd=request.getRequestDispatcher("AddHostel.jsp");
				rd.include(request, response);
			}
		
		}
	

}

