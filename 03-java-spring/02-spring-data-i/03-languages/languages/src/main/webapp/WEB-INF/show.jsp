<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detail</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<div class="container">
<a href="/">Dashboard</a>
<div class="row">
<div class="column">
<c:out value="${thisLang.name}"/>
</div>
<c:out value="${thisLang.creator}"/>
</div>


<c:out value="${thisLang.currentVersion}"/>
<div>
<a class="btn btn-primary" href="/edit/${thisLang.id}/">Edit</a>
						<form id="delete-form" action="/delete/${thisLang.id}" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input class="btn btn-danger" type="submit" value="Delete"></form>
</div>



</div>

</body>
</html>