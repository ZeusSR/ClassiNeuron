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

<c:redirect url="UrlTags2.jsp">
<c:param name="SpringFramework" value="JAVA"></c:param>
<c:param name="Blazor" value="C#"></c:param>
<c:param name="NextJS" value="React.js"></c:param>
</c:redirect>

</h1>

</body>
</html>