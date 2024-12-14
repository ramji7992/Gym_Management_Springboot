<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <form:form action="/addtxn" method="post" modelAttribute="txn">
        <table>
            <tr>
                <td>Registration ID:</td>
                <td><form:input path="registrationId" placeholder="Registration Id" required="true" /></td>
            </tr>
        	<tr>
                <td>Name:</td>
                <td><form:input path="customerName" placeholder="Enter your name" required="true" /></td>
            </tr>
            <tr>
                <td>Amount</td>
                <td><form:input path="amount" placeholder="Amount" required="true" /></td>
            </tr>

            <tr>
                <td><input type="submit" value="Submit"></td>
                <td><input type="reset" value="Clear"></td>
            </tr>
        </table>
    </form:form>
    <h3>${msg}</h3>
</body>
</html>
