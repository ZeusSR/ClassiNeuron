<%@  taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%-- The User is :: <c:out value="${param.user }"/><br> --%>
<%-- Password is :: <c:out value="${param.password}" default ="qwerty" /> --%>

<c:set var="x" value="20" scope= "request"/>
<c:set var="y" value="200" scope= "request"/>
<c:set var="Product" value="${x*y}" scope= "session"/>

<h1 style = "color:darkorange;text-align:center">
<c:out value = "Hey welcome to JSTL buddy........!!!"/><br>
The product-value is ::<c:out value = "${Product}"/>
</h1>

<h1 style = "color:darkorange;text-align:center">
<c:if test="${x<y}" var="res">
Then X is smaller than Y <br>
X value is :: ${x} <br>
The result is :: ${res}


</c:if>

</h1>

<h1 style = "color:red;text-align:center">
<c:choose>
<c:when test="${x<y}">

X is small 
</c:when>

<c:otherwise>
y is small
</c:otherwise>
</c:choose>

</h1>

<c:remove var="x" />
<c:remove var="y" />
<c:remove var="Product" />
<h1 style = "color:darkorange;text-align:center">

The product-value after using remove tag is ::<c:out value = "${Product}"/>

</h1>

<%
String[] names = {"Ramanujan","Shami","MSD","Kohli","Bhuvi"};
pageContext.setAttribute("names", names);
%>
<h1 style = "color:green;text-align:center">

<c:forEach items= "${names }" var = "obj">
The name is :: ${obj } <br>
</c:forEach>

</h1>

<h1 style = "color:yellow;text-align:center">
<c:forTokens items="Ramanujan,Shami,MSD,Kohli,Bhuvi" delims="," var="name">
From tokens value is :: ${name }<br>
</c:forTokens>
</h1>
</body>
</html>