<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@page import="java.util.List" %>
<%@page import="com.CMS.bean.Students" %>
<script type="text/javascript" src="BackButton.js"></script>
<link type="text/css" rel="stylesheet" href="Styling.css"/>
</head>
<body bgcolor="azure">
<%@ include file = "header.jsp" %>
<button onclick="goBack()">Go Back</button>
<br>
<br>
<h1>Student Details</h1>
<fieldset>
<br>
<br>

<table border="5px">
<tr>
   <th>Student_ID</th>
   <th>Student_Name</th>
   <th>Gender</th>
   <th>Date_Of_Birth</th>
   <th>Stream</th>
   <th>Email</th>
   <th>Contact</th>
   <th>Username</th>
   <th>Password</th>
   
   </tr>
   <%
   
   List<Students> stlist=(List<Students>)session.getAttribute("stu");
   
     for(Students s:stlist){
   %>
   <tr>
   <td><%=s.getsId() %></td>
    <td><%=s.getsName() %></td>
    <td><%=s.getGender() %></td>
      <td><%=s.getDob() %></td>
        <td><%=s.getStream()%></td>
         <td><%=s.getEmail()%></td>
          <td><%=s.getContact()%></td>
           <td><%=s.getUsername() %></td>
            <td><%=s.getPassword() %></td>
          </tr>
 <% } %>    
   
</table>
<br>
<br>
</fieldset>
<%@ include file = "footer.jsp" %>
</body>
</html>