<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yatzy vent</title>
</head>
<body>
	Ditt endelige kast:
	<c:forEach items="${kopp}" var="kopp" varStatus="loop">
		<div>
			[
			<c:out value="${kopp}" />
			]
		</div>
	</c:forEach>
	
	Venter på din tur.....
</body>
</html>