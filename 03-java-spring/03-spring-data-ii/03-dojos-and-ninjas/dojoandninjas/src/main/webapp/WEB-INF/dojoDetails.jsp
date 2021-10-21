<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Details</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h1><c:out value="${dojo.name}"/>Location Ninjas</h1>
		<table class="table table-success table-striped>
			<tr>
				<th>First Name</th>
				<th> Last Name</th>
				<th>First Name</th>
			</tr>
			<tr>
			<c:forEach items="${dojo.ninjas }" var="ninja">
				<td><c:out value="${ninja.firstName }"/></td>
				<td><c:out value="${ninja.lastName }"/></td>
				<td><c:out value="${ninja.age }"/></td>
			</c:forEach>
			</tr>
 		</table>
	</div>

</body>
</html>