<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fitness World GYM</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }
    a {
        display: block;
        text-align: center;
        margin-bottom: 20px;
        text-decoration: none;
        font-size: 16px;
        color: blue;
    }
    a:hover {
        color: darkblue;
    }
    table {
        margin: 0 auto;
    }
    td {
        padding: 5px;
    }
</style>
</head>
<body>
    <a href="/">Home</a>

    <form:form action="/register" method="post" modelAttribute="user">
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" placeholder="Enter your name" required="true" /></td>
            </tr>
            <tr>
                <td>Mail ID:</td>
                <td><form:input path="mail" placeholder="Enter your email" required="true" /></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><form:input path="phone" placeholder="Enter your phone number" required="true" /></td>
            </tr>
            <tr>
                <td>User Name:</td>
                <td><form:input path="userName" placeholder="Choose a username" required="true" /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:password path="password" placeholder="Enter your password" required="true" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register"></td>
                <td><input type="reset" value="Clear"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
