<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bubu
  Date: 14.05.2021
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<html>
<head>
    <title>Book List</title>
</head>
<body>
<table border="1" style="font-size: 45px">
    <thead>
    <th>isbn</th>
    <th>title</th>
    <th>author</th>
    </thead>
    <tbody>
    <c:forEach items="${book}" var="book">
        <tr>
            <td><c:out value="${book.isbn}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
    <div><h1><a href="http://localhost:8080/BookAPI/books/home">HomePage</a></h1></div>
</body>
</html>
</body>
</html>
