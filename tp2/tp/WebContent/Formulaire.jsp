<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="ffffcc">
<h4>vous avez fourni les informations suivantes:</h4>
<%String nom=request.getParameter("Nom"); %>
<%String email=request.getParameter("email");%>
<h4>Nom:<%=nom  %></h4>
<h4>Email:<%= email %></h4>
</body>
</html>