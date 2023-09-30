<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Error</title>
    <style>
        body {
            background-color: #f8d7da; /* Light red background color */
            color: #721c24; /* Dark red text color */
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #721c24; /* Dark red header background color */
            padding: 10px;
            text-align: center;
        }

        h1, h2 {
            color: #fff; /* White text color */
        }

        center {
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Error</h1>
    </header>
    <center>
        <h2><%=exception.getMessage() %><br/> </h2>
    </center>
</body>
</html>
