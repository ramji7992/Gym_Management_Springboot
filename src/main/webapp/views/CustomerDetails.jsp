<!-- <%@ page contentType="text/html;charset=UTF-8" language="java" %> -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>

<html>
<head>
    <title>Customer Details</title>
</head>
<body>
    <h1><a href="/welcomePage" >Home</a></h1>
    <h1>Customer Details</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Registration id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Mobile</th>
                <th>Email</th>
                <th>Registration Date</th>
                <th>Remarks</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cb" items="${customers}">
                <tr>
                    <td>${cb.id}</td>
                    <td>${cb.firstName}</td>
                    <td>${cb.lastName}</td>
                    <td>${cb.phone}</td>
                    <td>${cb.mail}</td>
                    <td>${cb.date}</td>
                    <td>${cb.remarks}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>