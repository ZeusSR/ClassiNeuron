<%@  taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OUTPUT</title>
</head>
<body>
<h1 style = "color:cyan;text-align:center">
Welcome to neuralnet::

<%-- <c:import url="UrlTags2.jsp"> --%>
<%-- <c:param name="SpringFramework" value="JAVA"></c:param> --%>
<%-- <c:param name="Blazor" value="C#"></c:param> --%>
<%-- <c:param name="NextJS" value="React.js"></c:param> --%>
<%-- </c:import> --%>

<%-- <c:redirect url="UrlTags2.jsp"> --%>
<%-- <c:param name="SpringFramework" value="JAVA"></c:param> --%>
<%-- <c:param name="Blazor" value="C#"></c:param> --%>
<%-- <c:param name="NextJS" value="React.js"></c:param> --%>
<%-- </c:redirect> --%>

<c:url value = "UrlTags2.jsp" var = "x" scope ="request">
<c:param name="SpringFramework" value="JAVA"></c:param>
<c:param name="Blazor" value="C#"></c:param>
<c:param name="NextJS" value="React.js"></c:param>
</c:url>
The modified URL is:: ${x}
<a href ="${x }">Click here to go next page</a>
</h1>

</body>
</html>