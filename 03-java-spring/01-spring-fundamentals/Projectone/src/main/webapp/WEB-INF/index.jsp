<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My super cool web page</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h1>HI</h1>
<p><c:out value="${2 + 4}"></c:out></p>

<form action="/telljoke" method="POST">
<input type="text" name="name" placeholder="your name">
<textarea name="joke" placeholder="your joke here tell a joke"></textarea>
<button>Submit A Joke</button>
</form>
 
</body>
</html>