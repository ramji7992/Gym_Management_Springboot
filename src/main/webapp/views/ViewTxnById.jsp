<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fitness World GYM</title>
</head>
<body>
    <form:form action="/viewTxnById" method="post" modelAttribute="txnbyid">
        <table>
            <tr>
                <td>Registration ID:</td>
                <td><form:input path="registrationId" placeholder="Registration Id" required="true" /></td>
            </tr>
             <tr>
                <td><input type="submit" value="Submit"></td>
                <td><input type="reset" value="Clear"></td>
             </tr>
        </table>
    </form:form>
</body>
</html>
