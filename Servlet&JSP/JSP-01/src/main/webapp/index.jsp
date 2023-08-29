<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output</title>
</head>
<body>

	<%
	  Integer count = (Integer)application.getAttribute("hitcount");
		
	if(count == null)
	{
		count = 1;	
	}
	else
	{
		count++;
	}
	  application.setAttribute("hitcount", count);
	%>
	<h1 style='text-align:center; color:red;'>The hit count for the application is :: <%= count %></h1>

</body>
</html>