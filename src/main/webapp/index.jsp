<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<body>
<h1>Witaj ${sessionScope.userName}!</h1>
<form>
    <label>Wpisz miasto, ulice albo miejsce</label>
    <input type="text">
    <button type="submit">Pokaz na mapie</button>
</form>

</body>
</html>
