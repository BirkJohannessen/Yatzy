<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Registreringsskjema</h2>
	
	<form method="post">
		<fieldset>
			<div>
				<label for="brukernavn">Brukernavn</label>
				<input type="text" name="brukernavn" id="brukernavn" value="${registrering.brukernavn}" placeholder="Brukernavn" required>
			</div>
			<div>
				<label for="passord">Passord</label>
				<input type="password" name="passord" id="passord" value="${registrering.passord}" placeholder="Passord" required>
			</div>	
			<div>
				<label for="navn">Navn på deltaker</label>
				<input type="text" name="navn" id="navn" value="${registrering.navn}" placeholder="Navn" required>
			</div>
			<div>
				<label for="epost">E-post</label>
				<input type="text" name="epost" id="epost" value="${registrering.epost}" placeholder="E-post" required>
			</div>
			<div>
				<button type="submit" class="pure-button pure-button-primary">Registrer</button>
			</div>
		</fieldset>
	</form>
</body>
</html>