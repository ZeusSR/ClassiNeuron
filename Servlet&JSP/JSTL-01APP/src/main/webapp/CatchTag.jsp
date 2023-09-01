<%@  taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style = "color:cyan;text-align:center">
  x value is :: ${param.x}<br>
 <c:catch var = "e">
  <%
  int y = Integer.parseInt(request.getParameter("y"));
  %>
  
  y value is :: ${param.y}<br>
  </c:catch>
  
  <c:if test="${e != null}"> Exception occured check code..........!!!!!! </c:if><br>
  
  z value is :: ${param.z}
</h1>
</body>
</html>