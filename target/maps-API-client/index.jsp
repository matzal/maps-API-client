<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Start</title>
</head>
<body>
<form action="/point" method="post">
    <label>Wpisz miasto, ulicę albo miejsce</label>
    <input type="text" name="userInput">
    <button type="submit">Pokaż na mapie</button>
</form>

</body>
</html>
