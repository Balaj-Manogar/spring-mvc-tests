<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ModelAtrribute vs RequestBody</title>
</head>
<body>
	<h3>ModelAtrribute vs RequestBody</h3>
	<form action="mobile/attrib/" method="get">
		id: <input type="text" name="id" /><br /> 
		title: <input type="text" name="title" /><br /> 
		language: <input type="text" name="language" /><br /> 
		author: <input type="text" name="author" /><br />
		<input type="submit" value="submit" />
	</form>
</body>
</html>