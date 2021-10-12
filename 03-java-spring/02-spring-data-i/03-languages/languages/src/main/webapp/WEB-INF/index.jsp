<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Welcome to Languages</h1>
<hr>
	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<td>Name</td>
				<td>Creator</td>
				<td>Version</td>
				<td>Action</td>
			</tr>
		</thead>

		<tbody>
	<c:forEach items="${allLanguages}" var="lang">
			<tr>
				<td><a href="/show/${lang.id}">${ lang.name }</a></td>
				<td>${lang.creator}</td>
				<td>${lang.currentVersion}</td>
				<td><a class="btn btn-primary" href="/${ lang.id }/edit">Edit</a>
						<form id="delete-form" action="/delete/${lang.id}" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input class="btn btn-danger" type="submit" value="Delete"></form></td>
			</tr>
	</c:forEach>
		</tbody>


	</table>

<h3>Create New Language</h3>
<form:form action="/" method="post" modelAttribute="language">
<p>
<form:label path="name">Name</form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p>
<p>
<form:label path="creator">Creator</form:label>
<form:errors path="creator"/>
<form:input path="creator"/>
</p>
<p>
<form:label path="currentVersion">Version</form:label>
<form:errors path="currentVersion"/>
<form:input path="currentVersion"/>
</p>
<button>Submit New Language</button>
</form:form>
</div>

</body>
</html>