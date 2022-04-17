<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" class="pure-form pure-form-aligned">
		<div class="pure-controls">
			<input type="hidden" id="query" name="query" value="2">
			 <label for="spillID">SpillID:</label>
  			<input type="text" id="spillID" name="spillID"><br><br>
			<button type="submit" class="pure-button pure-button-primary">gå til spill</button>
		</div>
			
	</form>

	<form method="post" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-controls">
				<input type="hidden" id="query" name="query" value="1">
			 	<label for="spiller2">spiller 2:</label>
  				<input type="text" id="spiller2" name="spiller2"><br><br>
  				<label for="spiller3">spiller 3:</label>
  				<input type="text" id="spiller3" name="spiller3"><br><br>
  				<label for="spiller4">spiller 4:</label>
  				<input type="text" id="spiller4" name="spiller4"><br><br>
  				<label for="spiller5">spiller 5:</label>
  				<input type="text" id="spiller5" name="spiller5"><br><br>
  				<label for="spiller6">spiller 6:</label>
  				<input type="text" id="spiller6" name="spiller6"><br><br>
				<button type="submit" class="pure-button pure-button-primary">Start spill</button>
			</div>
		</fieldset>
	</form>
</body>
</html>