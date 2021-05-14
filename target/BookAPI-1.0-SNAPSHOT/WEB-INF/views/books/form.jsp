<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form:form method="post" modelAttribute="book">
    <label for="isbn">ISBN
    <form:input path="isbn" id="isbn"/>
    </label>
    <label for="title">Tytuł
        <form:input path="title" id="title"/>
    </label>
    <label for="author">Autor
        <form:input path="author" id="author"/>
    </label>
    <label for="publisher">Wydawca
        <form:input path="publisher" id="publisher"/>
    </label>
    <label for="type">Gatunek
        <form:input path="type" id="type"/>
    </label>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
