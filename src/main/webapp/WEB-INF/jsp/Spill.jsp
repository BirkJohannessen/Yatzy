<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yatzy</title>
</head>
<body>

	<form method="post">
	velg de verdiene du vil kaste vekk..
		<c:forEach items="${kopp}" var="kopp" varStatus="loop">
			<div>
				<input type="checkbox" id="index${loop.index}" name="index${loop.index}"> 
					<label for="index${loop.index}">${kopp}</label>
			</div>
		</c:forEach>
		<div>
			<button type="submit">fjern</button>
		</div>
	</form>
</body>
</html>