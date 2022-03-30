<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yatzy</title>
<link href="Yatzy.css" rel="stylesheet" type="text/css"/>
<style type="text/css">

</style>
</head>
<body>	
<div>
<h1>Yatzy</h1>
</div>
	<div class="main">
		<div class="brett">
		<table>
		<tr>
			<th class="runder">Runde</th>
			<c:forEach items="${spillerListe}" var="spiller">;
				<th>${spiller.brukernavn}</th>
			</c:forEach>
		</tr>
		<tr>
			<th class="runder">Enere</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">Toere</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">Treere</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		<tr>
			<th class="runder">Firere</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		<tr>
			<th class="runder">Femmere</th>
			<:forEach items="${score}" var="score">
				<td>${score}</td>
			</:forEach></tr>
		</tr>
		<tr>
			<th class="runder">Seksere</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">Score del 1</th>
			<th>Score spiller 1</th>
			<th>Score spiller 2</th>
			<th>Score spiller 3</th>
			<th>Score spiller 4</th>
			<th>Score spiller 5</th>
		</tr>
		<tr class="score">
			<th class="runder">Bonus</th>
			<th>Score spiller 1</th>
			<th>Score spiller 2</th>
			<th>Score spiller 3</th>
			<th>Score spiller 4</th>
			<th>Score spiller 5</th>
		</tr>
		<tr class="score">
			<th class="runder">Total score del 1</th>
			<th>Score spiller 1</th>
			<th>Score spiller 2</th>
			<th>Score spiller 3</th>
			<th>Score spiller 4</th>
			<th>Score spiller 5</th>
		</tr>
		<tr>
			<th class="runder">1 par</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">2 par</th>
			<td>Score spiller 1</td>
			<td>Score spiller 2</td>
			<td>Score spiller 3</td>
			<td>Score spiller 4</td>
			<td>Score spiller 5</td>
		</tr>
		<tr>
			<th class="runder">3 like</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">4 like</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">Liten straight</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">Stor straight</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">Hus</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">Sjanse</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr>
			<th class="runder">Yatzy!</th>
			<:forEach items="${spillerListe}" var="spiller">
				<td>${spiller.score}</td>
			</:forEach>
		</tr>
		<tr class="score">
			<th class="runder">Total sum</th>
			<th>Sum spiller 1</th>
			<th>Sum spiller 2</th>
			<th>Sum spiller 3</th>
			<th>Sum spiller 4</th>
			<th>Sum spiller 5</th>
		</tr>
		</table>
		</div>
		<div class="knapp">
			<button type="submit" class="pure-button pure-button-primary">Lagre spill</button>
		</div>
	</div>
</body>
</html>
