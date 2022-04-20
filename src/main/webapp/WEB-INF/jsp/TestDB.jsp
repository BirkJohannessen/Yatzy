<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yatzy DB TEST</title>
</head>
<body>
	<p>${param.test1}</p>
	tab;
	<c:forEach items="${testTab}" var="testTab" varStatus="loop">
		<div>
			[
			<c:out value="${testTab}" />
			]
		</div>
	</c:forEach>
	
	test!!
</body>
</html>