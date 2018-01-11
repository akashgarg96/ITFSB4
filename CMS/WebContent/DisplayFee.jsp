<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@page import="java.util.List"%>
<%@page import="com.CMS.bean.FeeStr"%>
<script type="text/javascript" src="BackButton.js"></script>
<link type="text/css" rel="stylesheet" href="Styling.css"/>
</head>
<body color="azure">
<%@ include file = "header.jsp" %>
<button onclick="goBack()">Go Back</button>
<br>
<br>
<h1>Fee Structure</h1>
<fieldset>
<br>
<br>
<table border="5px">
<tr><th>Stream Name</th>
	<th>Fee</th>
	</tr>
	<%
	List<FeeStr> fS=(List<FeeStr>)session.getAttribute("fs");
	
	for(FeeStr f:fS)
	{
	%>
	<tr>
	<td><%=f.getStream()%></td>
	<td><%=f.getFee()%></td>
	</tr>
	<%} %>
</table>
<br>
<br>
</fieldset>
<%@ include file = "footer.jsp" %>
</body>
</html>