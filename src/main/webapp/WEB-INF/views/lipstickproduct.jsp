<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lipstick Product</title>
</head>
<body>
    <h1>Lipstick Product List</h1>
    <table border="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Color</th>
            <th>Price</th>
            <th>Description</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.brand}</td>
                <td>${user.color}</td>
                <td>${user.price}</td>
                <td>${user.description}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
