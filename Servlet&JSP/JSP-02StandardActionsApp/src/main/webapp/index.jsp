<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%--  <jsp:useBean id="player" class="in.neuralnet.beans.Player" scope="page"> --%>
<%--     <jsp:setProperty property="id" name="player" value="07"/> --%>
<%--  	<jsp:setProperty property="name" name="player" value="MSD"/> --%>
<%--     <jsp:setProperty property="jersey" name="player" value="07"/> --%>
<%--     <jsp:setProperty property="team" name="player" value="CSK"/> --%>
<%--  </jsp:useBean> --%>

<!-- Now dynamically accepting params  --> 

<%-- <%! --%>
<!--  Integer id; -->
<!--  String name; -->
<!--  String jersey; -->
<!--  String team; -->
<%-- %> --%>
<%-- <% --%>
<!--   id = Integer.parseInt(request.getParameter("id")); -->
<!--   name = request.getParameter("name"); -->
<!--   jersey = request.getParameter("jersey"); -->
<!--   team = request.getParameter("team"); -->
<%-- %> --%>

<%--  <jsp:useBean id="player" class="in.neuralnet.beans.Player" scope="page"> --%>
<%--     <jsp:setProperty property="id" name="player" value='<%=id%>'/> --%>
<%--  	<jsp:setProperty property="name" name="player" value='<%=name%>'/> --%>
<%--     <jsp:setProperty property="jersey" name="player" value='<%=jersey%>'/> --%>
<%--     <jsp:setProperty property="team" name="player" value='<%=team%>'/> --%>
<%--  </jsp:useBean> --%>

<!-- Now auto-binding due to usage of same names as variables as used in bean --> 

 <jsp:useBean id="player" class="in.neuralnet.beans.Player" scope="page">
    <jsp:setProperty property="*" name="player" />
 </jsp:useBean>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Response Page</title>
</head>
<body bgcolor="lightgreen" >
<center>
<h2>Welome to Player details:</h2>
 	<table border=1>
 	<tr>
 	<th>ID: </th>
 	<td>
 	<jsp:getProperty property="id" name="player"/>
 	</td>
 	</tr>
 	<tr>
 	<th>Name: </th>
 	<td>
 	<jsp:getProperty property="name" name="player"/></td>
 	</tr>
 	<tr>
 	<th>Jersey No.: </th>
 	<td>
 	<jsp:getProperty property="jersey" name="player"/></td>
 	</tr>
 	<tr>
 	<th>Team: </th>
 	<td>
 	<jsp:getProperty property="team" name="player"/></td>
 	</tr>
 	</center>
 	</table>
 


</body>
</html>