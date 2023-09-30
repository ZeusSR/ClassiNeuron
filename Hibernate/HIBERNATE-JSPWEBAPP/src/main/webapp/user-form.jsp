

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Management Application</title>
    <style>
        body {
            background-color: #f0f8ff; /* Light Sky Blue */
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #32cd32; /* Lime Green */
            padding: 10px;
            text-align: center;
        }

        h1, h2 {
            color: #008080; /* Teal */
        }

        nav {
            background-color: #008080; /* Teal */
            text-align: center;
            padding: 10px;
        }

        nav a {
            color: #fff;
            text-decoration: none;
            margin: 0 10px;
            font-size: 18px;
        }

        form {
            margin: 20px auto;
            max-width: 600px;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #008080;
            color: #fff;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            background-color: #008080;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #006666; /* Dark Teal */
        }
    </style>
</head>
<body>
    <header>
        <h1>User Management Of Sports-Person</h1>
    </header>
    <nav>
        <a href="new">Add New User</a>
        <a href="list">List All Users</a>
    </nav>
    <form action="${user != null ? 'update' : 'insert'}" method="post">
        <table>
            <caption>
                <h2>${user != null ? 'Edit User' : 'Add New User'}</h2>
            </caption>
            <input type="hidden" name="uid" value="${user != null ? user.uid : ''}" />
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="sname" value="${user != null ? user.sname : ''}" />
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="semail" value="${user != null ? user.semail : ''}" />
                </td>
            </tr>
            <tr>
                <th>Country:</th>
                <td>
                    <input type="text" name="scountry" value="${user != null ? user.scountry : ''}" />
                </td>
            </tr>
            <tr>
                <th>Sports:</th>
                <td>
                    <input type="text" name="ssports" value="${user != null ? user.ssports : ''}" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
