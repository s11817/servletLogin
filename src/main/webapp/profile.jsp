<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="java.*" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Podglad uzytkownika</title>
</head>
<body>


<%
int nr = (Integer) session.getAttribute("nrOfUser");
String name = User.user.get(nr);
//String password = User.user.get(nr+1);
//String email = User.user.get(nr+2);
//String privilage = User.user.get(nr+3);
%>

<center>
 <%= name %>
<a href="logoutForm.jsp">Logout</a> <br />

</center>



</body>
</html>