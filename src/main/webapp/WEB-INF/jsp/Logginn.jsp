<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logg inn</title>
</head>
<body>
	<div style="Center">
	<h1>Logg inn for å spille</h1>
	</div>
	
	<p><font color="red">${param.feilmelding}</font></p>
	
	<form method="post" class="pure-form pure-form-aligned">
		<fieldset>
		
			<div class="pure-control-group"> 
				<label for="brukernavn">Brukernavn:</label> <input type="text" name="brukernavn" required>
			</div>
			
			<div class="pure-control-group"> 
				<label for="passord">Passord:</label> <input type="password" name="passord" required>
			</div>
			
			<div>
				<button type="submit" class="pure-button pure-button-primary">Logg inn</button>
			</div>
			
		</fieldset>
	</form>
	
</body>
</html>