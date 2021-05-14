<%--
  Created by IntelliJ IDEA.
  User: lutas
  Date: 17.04.2021
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form action="" method="post">
    <label for="isbn">ISBN
    <input type="text" name="isbn" id="isbn">
    </label>
    <label for="title">Tytuł
        <input type="text" name="title" id="title">
    </label>
    <label for="author">Autor
        <input type="text" name="author" id="author">
    </label>
    <label for="publisher">Wydawca
        <input type="text" name="publisher" id="publisher">
    </label>
    <label for="type">Gatunek
        <input type="text" name="type" id="type">
    </label>
    <input type="submit">
</form>
</body>
</html>
