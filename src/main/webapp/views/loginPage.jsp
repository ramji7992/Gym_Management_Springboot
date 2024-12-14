<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <form:form action="/loginOwner" method="post" modelAttribute="bind">
        <table>
           <tr>
            <td>User Name:</td>
            <td><form:input path="userName" placeholder="username" required="true" /></td>
           </tr>
           <tr>
             <td>Password:</td>
             <td><form:password path="password" placeholder="password" required="true" /></td>
           </tr>
           <tr>
            <td><input type="submit" value="LogIn"></td>
            <td><input type="reset" value="Clear"></td>
           </tr>
        </table>
    </form:form>
    <h3>${msg}</h3>
</body>
</html>
