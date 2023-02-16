<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotels</title>
<style>
div {
  background-color: white;
  width: 400px;
  height: 100px;
  border: 1px solid grey;
 
}
</style>

</head>
<body>

<h1 style="color:#87CEFA;"> Hotels in ${city}</h1>
	<c:forEach var="hotel" items="${hotels}">
 <div>
	
	 <h2 style="color:#87CEFA; margin-left:10px;"> Hotel :  ${hotel.hotelName}</h2>
	 <h3 style="margin-left:10px;"> Price per night : $   ${hotel.pricePerNight} </h3>
</div>
	
	</c:forEach>
<br> <br>
<a href="/"> Start a New Search </a>
</body>
</html>