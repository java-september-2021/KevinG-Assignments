<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create Product</h1>
<form action="/newProd" method="POST">
<p>
<label for="name">Name</label>
<input type="text" name="name">
</p>
<p>
<label for="price">Price</label>
<input type="text" name="price">
</p>
<p>
<label for="name">Description<label>
<textarea rows="4" cols="3" name="description" ></textarea>
</p>
<button>Create Product</button>
</body>
</html>	