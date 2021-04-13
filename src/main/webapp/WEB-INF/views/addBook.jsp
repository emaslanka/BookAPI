<%--
  Created by IntelliJ IDEA.
  User: eve
  Date: 13.04.2021
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%--://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add new book</title>
</head>
<body>


<form action="/books/add" method="post">
<input>
    <label>ISBN</label>
    <input type="text" name="isbn"/>

<label>Title:</label>
<input type="text" name="title"/>

<label>Author</label>
<input type="text" name="author"/>

<label>Publisher</label>
<input type="text" name="publisher"/>

<label>Type</label>
<input type="text" name="type"/>

<input type="submit" name="Send"/>

</form>

</body>
</html>
