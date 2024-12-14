<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Details</title>
</head>
<body>
    <h1><a href="/welcomePage" >Home</a></h1>
    <h1>Transaction Details</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Transaction No</th>
                <th>Registration id</th>
                <th>Customer Name</th>
                <th>Amount</th>
                <th>Date</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="tb" items="${txns}">
                <tr>
                    <td>${tb.txnNo}</td>
                    <td>${tb.registrationId}</td>
                    <td>${tb.customerName}</td>
                    <td>${tb.amount}</td>
                    <td>${tb.date}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>