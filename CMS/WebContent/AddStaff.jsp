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

<h1>Staff Info</h1>
<% 
String errormsg=(String)request.getAttribute("msg");
if(errormsg!=null)
{
%>
<h3 style="color:red"><%=errormsg %></h3>
<%} %>
<fieldset>
<legend>Staff Details</legend>
<form action="StaffController" method="post">
<table width="50%">
<tr height="40">
<td>Staff Id</td>
<td><input type="text" placeholder="enter StaffId"  name="staffId"  maxlength="10" required/></td>
</tr>
<tr>
<tr height="40">
<td>Staff Name</td>
<td><input type="text" placeholder="enter StaffName" name="staffName" maxlength="40" required/></td>
</tr>



<tr height="40">
<td>Salary</td>
<td><input type="text" placeholder="enter salary" name="salary"  maxlength="20" required/></td>
</tr>

<tr height="40">
<td>UserName</td>
<td><input type="text" placeholder="enter username" name="staffUsername"  maxlength="20" required/></td>
</tr>

<tr height="40">
<td>Password</td>
<td><input type="text" placeholder="enter password" name="staffPassword"  maxlength="20" required/></td>
</tr>

<tr height="40">
<td>Department Name</td>
<td>
<select name="deptName" >
  <option value="CSE">COMPUTER SCIENCE</option>
  <option value="ECE">ELECTRICAL</option>
  <option value="EEE">ELECTRONICS</option>
  <option value="MECH">MECHANICAL</option>
  <option value="IT">IT</option>
</select>


</td>
</tr>

<td><input type="submit" value="Submit"/> <input type="reset" value="Reset"/></td>

</tr>
</table>
</form>
</fieldset>
<%@ include file = "footer.jsp" %>
</body>
</html>