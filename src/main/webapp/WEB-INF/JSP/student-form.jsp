<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body bgcolor="grey">
	<h2>Student form</h2>
	<form action="${pageContext.request.contextPath}/getStdnt" method="post">
		<label for="name">Name:</label> <input type="text" id="name"
			name="name" /><br />
		<br /> <label for="department">Department:</label> <input type="text"
			id="department" name="department" /><br />
		<br /> <label for="age">Age:</label> <input type="number" id="age"
			name="age" /><br />
		<br />
		<button type="submit">Submit</button>
	</form>
</body>
</html>