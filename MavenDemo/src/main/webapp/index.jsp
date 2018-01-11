<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>

<legend>Login</legend>
<form action="LoginController" method="post">
<table width="30%">
<tr height="40">
<td>Username</td>
<td><input type="text" placeholder="Enter Ur Name" name="uName" maxlength="10" /></td>
</tr>
<tr>
<tr height="40">
<td>Password</td>
<td><input type="password" placeholder="Enter Ur Password" name="uPass" maxlength="10" /></td>
</tr>
<tr height="40">
<td><input type="submit"  value="Login"/>  <input type="reset" value="Reset"></td>


</tr>
</table>
</form>
</fieldset>
</body>
</html>