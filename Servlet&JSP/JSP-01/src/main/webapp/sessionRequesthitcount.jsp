<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	  Integer count = (Integer)session.getAttribute("Sessionusercount");
	


	if(count == null)
	{
		count = 1;	
	}
	else
	{
		count++;
	}
	
	session.setAttribute("Sessionusercount", count);
	%>
	<h1 style='text-align:center; color:green;'>The user count for the application is :: <%= count %></h1>

</body>
</html>