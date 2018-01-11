<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@page import="java.util.List"%>
<%@page import="com.CMS.bean.Hostel"%>
<script type="text/javascript" src="BackButton.js"></script>
<link type="text/css" rel="stylesheet" href="Styling.css"/>
</head>
<body color="azure">
<%@ include file = "header.jsp" %>
<button onclick="goBack()">Go Back</button>
<br>
<br>
<h1>Room Details</h1>
<fieldset>
<br>
<br>
<table border="5px">
<tr><th>Room No</th>
	<th>Seater Type</th>
	<th>Room Type</th>
	</tr>
	<%
	List<Hostel> room=(List<Hostel>)session.getAttribute("r");
	
	for(Hostel h:room)
	{
	%>
	<tr>
	<td><%=h.getRoomNo()%></td>
	<td><%=h.getSeaterType()%></td>
	<td><%=h.getRoomType()%></td>
	</tr>
	<%} %>
</table>
<br>
<br>
</fieldset>
<%@ include file = "footer.jsp" %>
</body>
</html>