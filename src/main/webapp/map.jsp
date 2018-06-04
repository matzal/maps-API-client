<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h3>Mapa z punktem:</h3>
<div id="map" style="height: 400px; width: 50%"></div>
<script>
    function initMap() {
        var resultPoint = {lat: ${sessionScope.latitude}, lng: ${sessionScope.longitude}};
        var map = new google.maps.Map(
            document.getElementById('map'), {zoom: 16, center: resultPoint});
        var marker = new google.maps.Marker({position: resultPoint, map: map});
    }
</script>
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=${googleKey}&callback=initMap">
</script>