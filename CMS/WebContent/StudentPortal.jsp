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
<fieldset>
<h2><a href="Accomodation.jsp">View Rooms</a></h2>

<h2><a href="StudentController">My Classmates</a></h2>

<h2><a href="AdmitCard.jsp">Download Admit Card</a></h2>
</fieldset>
<%@ include file = "footer.jsp" %>
</body>
</html>