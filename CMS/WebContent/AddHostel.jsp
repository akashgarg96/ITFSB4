<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="BackButton.js"></script>
<link type="text/css" rel="stylesheet" href="Styling.css"/>
</head>
<body color="azure">
<%@ include file = "header.jsp" %>
<button onclick="goBack()">Go Back</button>
<br>
<br>
<h1>Hostel Info</h1>
<% 
String errormsg=(String)request.getAttribute("msg");
if(errormsg!=null)
{
%>
<h3 style="color:red"><%=errormsg %></h3>
<%} %>
<fieldset>
<legend>Hostel Details</legend>

<form action="HostelController" method="post">
<table width="50%">
<tr height="40">
<td>Room No.</td>
<td><input type="text" placeholder="enter room number"  name="roomNo"  maxlength="10" required/></td>
</tr>
<tr>
<tr height="40">
<td>Seater Type</td>
<td><select name="seaterType">
	<option>SINGLE</option>
	<option>DOUBLE</option>
	<option>TRIPLE</option>
</select></td>
</tr>

<tr height="40">
<td>Room Type</td>
<td><select name="roomType">
	<option>AC</option>
	<option>NON-AC</option>
</select></td>
</tr>


<td><input type="submit" value="Submit"/> <input type="reset" value="Reset"/></td>

</tr>
</table>
</form>
</fieldset>
<%@ include file = "footer.jsp" %>
</body>
</html>