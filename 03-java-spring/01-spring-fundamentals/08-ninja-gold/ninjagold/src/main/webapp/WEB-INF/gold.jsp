<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
<link rel="stylesheet" href="css/style.css">

<h3>Your Gold: <c:out value="${totalGold}"/></h3>
<div class="building">
<form method="POST" action ="/findGold">
<h3>Farm</h3>
<input type="hidden" name="building" value="farm">
<p>Earns 10-20 Gold</p>
<button>Find Gold</button>
</form>
</div>
<div class="building">
<form method="POST" action ="/findGold">
<h3>Cave</h3>
<input type="hidden" name="building" value="cave">
<p>Earns 5-10 Gold</p>
<button>Find Gold</button>
</form>
</div>

<div class="building">
<form method="POST" action ="/findGold">
<h3>House</h3>
<input type="hidden" name="building" value="house">
<p>Earns 2-5 Gold</p>
<button>Find Gold</button>
</form>
</div>

<div class="building">
<form method="POST" action ="/findGold">
<h3>Casino</h3>
<input type="hidden" name="building" value="casino">
<p>Earns/Loses 0-50 Gold</p>
<button>Find Gold</button>
</form>
</div>

<h3>Activities</h3>
<div class="activities">
activities here

</div>


</div>
</body>

</html>