<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<h1> Hotel Search </h1>

	<form action="/results" method="POST">

		<label for="city"> City:</label>  <br> <br>
			
			<select id="city" name="city">
			  <option value="Las Vegas">Las Vegas</option>
			  <option value="Denver">Denver</option>
			  <option value="Tampa">Tampa</option>
			  <option value="Edison">Edison</option>
			</select> 
	
		<br> <br>
		<input type="submit" value="Go!">
		
	</form>

</body>
</html>