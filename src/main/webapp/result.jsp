<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Map</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>
<body>
<h1>Współrzędne:</h1>
<h3>${sessionScope.latitude}</h3>
<h3>${sessionScope.longitude}</h3>

<c:if test="${errorMessage != null}">
    <h3 style="color: red">${errorMessage}</h3>
</c:if>

<jsp:include page="map.jsp"/>

<a href="http://localhost:8080" class="btn btn-default" style="background: #495057">Wstecz</a>
</body>
</html>
