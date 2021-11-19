<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>SI Calculation</h1>

<form action ="calculate" method="post">
<label for="amount">Principle Amount</label>

<input id="amount" name="amount" type="number"/>
<br/><br/>
<label for="year">Year</label>

<input id="year" name="year" type="number"/>
<br/><br/>
<label for="interest">Interest</label>

<input id="interest" name="interest" type="number"/>
<br/><br/>

<button type="submit">submit
</button>

</form>
</body>
</html>