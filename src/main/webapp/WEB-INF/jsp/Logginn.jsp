<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Logg inn</title>
</head>
<body>
	<h2>Logg inn</h2>
	
	<p>${param.f1}</p><!-- f1: skal være timeout melding fra ulike steder -->
	
	<p>
		<font color="red">${param.f2}</font><!-- f2: skal være feil login -->
	</p>
	<form method="post" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="mobil">Brukernavn:</label> <input type="text" name="bruker" />
			</div>
			<div class="pure-control-group">
				<label for="passord">Passord:</label> <input type="passord"
					name="passord" />
			</div>
			<div class="pure-controls">
				<button type="submit" class="pure-button pure-button-primary">Logg inn</button>
			</div>
		</fieldset>
	</form>

</body>
</html>