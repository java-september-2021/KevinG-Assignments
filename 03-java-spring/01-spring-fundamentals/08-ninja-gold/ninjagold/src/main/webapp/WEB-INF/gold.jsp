<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
<link rel="stylesheet" href="/css/style.css">
</head>

<body>
<div class="container">
<p>Your Gold: <c:out value="${totalGold}"/></p> 

<div class="building">
<form action="/findGold" method="POST">
<h3>Farm</h3>
<p>Earns 10-20 Gold</p>
<input type="hidden" name="building" value="farm">
<button>Find Gold</button>

</form>
</div>

<div class="building">
<form action="/findGold" method="POST">
<h3>Cave</h3>
<p>Earns 5-10 Gold</p>
<input type="hidden" name="building" value="cave">
<button>Find Gold</button>

</form>
</div>

<div class="building">
<form action="/findGold" method="POST">
<h3>House</h3>
<p>Earns 2-5 Gold</p>
<input type="hidden" name="building" value="house">
<button>Find Gold</button>
</form>


</div>
<div class="building">
<form action="/findGold" method="POST">
<h3>Casino</h3>
<p>Earns/Loses 0-50 Gold</p>
<input type="hidden" name="building" value="casino">
<button>Find Gold</button>

</form>

</div>

<h2>Activities</h2>
<div class="activities">
<c:forEach items="${activites}" var="act">
<c:choose>
<c:when test="${act.contains('ouch')}">
<p class="red">${act}</p>
</c:when>
<c:otherwise>
<p class="green">${act}</p>
</c:otherwise>
</c:choose>
</c:forEach>
</div>




</body>
</html>