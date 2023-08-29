<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response</title>
</head>
<body>
<%
	  Integer count = (Integer)application.getAttribute("usercount");
	

	if(session.isNew())
	{
	if(count == null)
	{
		count = 1;	
	}
	else
	{
		count++;
	}
	}
	  application.setAttribute("usercount", count);
	%>
	<h1 style='text-align:center; color:green;'>The user count for the application is :: <%= count %></h1>

</body>
</html>