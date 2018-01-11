<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@page import="java.util.List" %>
<%@page import="com.CMS.bean.Staff" %>
<script type="text/javascript" src="BackButton.js"></script>
<link type="text/css" rel="stylesheet" href="Styling.css"/>
</head>
<body bgcolor="azure">
<%@ include file = "header.jsp" %>
<button onclick="goBack()">Go Back</button>
<br>
<br>
<h1>Staff Details</h1>
<fieldset>
<br>
<br>

<table border="5px">
<tr>
   <th>Staff_ID</th>
   <th>Staff_Name</th>
   
   <th>Salary</th>
   <th>Username</th>
   <th>Password</th>
   <th>Dept_Name</th>
   </tr>
   <%
   
   List<Staff> stafflist=(List<Staff>)session.getAttribute("shh");
   
     for(Staff sh:stafflist){
   %>
   <tr>
   <td><%=sh.getStaffId() %></td>
    <td><%=sh.getStaffName() %></td>
    
      <td><%=sh.getSalary() %></td>
        <td><%=sh.getStaffUsername()%></td>
          <td><%=sh.getStaffPassword() %></td>
           <td><%=sh.getDeptName() %></td>
          </tr>
 <% } %>     
   
</table>
<br>
<br>
</fieldset>
<%@ include file = "footer.jsp" %>
</body>
</html>