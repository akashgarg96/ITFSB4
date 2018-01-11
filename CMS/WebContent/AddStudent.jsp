<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="BackButton.js"></script>
<link type="text/css" rel="stylesheet" href="Styling.css"/>
</head>
<body bgcolor="azure">
<%@ include file = "header.jsp" %>
<button onclick="goBack()">Go Back</button>
<br>
<br>

<h1>Student Info</h1>
<% 
String errormsg=(String)request.getAttribute("msg");
if(errormsg!=null)
{
%>
<h3 style="color:red"><%=errormsg %></h3>
<%} %>
<fieldset>
<legend>Student Details</legend>
<form action="StudentController" method="post">
<table width="50%">
<tr height="40">
<td>Student Id</td>
<td><input type="text" placeholder="enter student id"  name="sId"  maxlength="10" required/></td>
</tr>
<tr>
<tr height="40">
<td>Student Name</td>
<td><input type="text" placeholder="enter student name" name="sName" maxlength="40" required/></td>
</tr>

<tr height="40">
<td>Gender</td>
<td><input type="text" placeholder="enter gender" name="gender"  maxlength="10" required/></td>
</tr>

<tr height="40">
<td>Date Of Birth</td>
<td><input type="text"  placeholder="enter dob(dd/MM/yyyy)" name="dob"  maxlength="20" required/></td>
</tr>

<tr height="40">
<td>Stream Name</td>
<td>
<select name="stream" >
  <option value="CSE">COMPUTER SCIENCE</option>
  <option value="ECE">ELECTRICAL</option>
  <option value="EEE">ELECTRONICS</option>
  <option value="MECH">MECHANICAL</option>
  <option value="IT">INFORMATION TECHNOLOGY</option>
</select>
</td>
</tr>

<tr height="40">
<td>Email</td>
<td><input type="text" placeholder="enter email" name="email"  maxlength="30" required/></td>
</tr>

<tr height="40">
<td>Contact</td>
<td><input type="text"  placeholder="enter contact" name="contact"  maxlength="10" required/></td>
</tr>


<tr height="40">
<td>Username</td>
<td><input type="text" placeholder="enter username" name="username"  maxlength="30" required/></td>
</tr>

<tr height="40">
<td>Password</td>
<td><input type="text"  placeholder="enter password" name="password"  maxlength="30" required/></td>
</tr>
<tr height="40">

<td><input type="submit" value="Submit"/> <input type="reset" value="Reset"/></td> 

</tr>
</table>
</form>
</fieldset>
<%@ include file = "footer.jsp" %>
</body>
</html>