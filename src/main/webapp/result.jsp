<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Map</title>
</head>
<body>
<h1>Wspolrzedne:</h1>
<h3>${sessionScope.latitude}</h3>
<h3>${sessionScope.longitude}</h3>

<c:if test="${errorMessage != null}">
    <h3 style="color: red">${errorMessage}</h3>
</c:if>

<jsp:include page="map.jsp"/>
</body>
</html>
