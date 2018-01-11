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
<fieldset>
<h2 style="color:blue"><a href="AddStudent.jsp">ADD NEW STUDENT</a></h2>
<h2 style="color:blue"><a href="StudentController">VIEW STUDENT DETAILS</a></h2>
</fieldset>
<%@ include file = "footer.jsp" %>
</body>
</html>