<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Ninja</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">  
</head>
<body>
<div class="container">
		<form:form method="POST" action="/ninja/createNinja" modelAttribute="ninja">
			<p>
				<form:label path="dojo">dojo</form:label>
				<form:errors path="dojo"/>
				<form:select path="dojo">
			<c:forEach items="${allDojos}" var="dojo">
			<option value="${dojo.id}"> ${dojo.name}</option>
			</c:forEach>	
				</form:select>
			
		</p>
		<p>
		<form:label path="firstName">First Name</form:label>
		<form:errors path="firstName"/>
		<form:input path="firstName"/>
		</p>
		<p>
		<form:label path="lastName">Last Name</form:label>
		<form:errors path="lastName"/>
		<form:input path="lastName"/>
		</p>
		<p>
		<form:label path="age">Age</form:label>
		<form:errors path="age"/>
		<form:input path="age"/>
		</p>
		<button>Create Ninja</button>
		</form:form>	
	
	</div>

</body>
</html>