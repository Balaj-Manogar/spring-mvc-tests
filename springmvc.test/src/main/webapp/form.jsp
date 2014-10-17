<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
	<h2>Subscription form</h2>
	<form:form  action="/springmvc.test/book/data-binding/">
	
		Name: <input type="text" name="name" /><br /> E-mail <input
			type="text" name="email" /><br /> <input type="submit"
			value="Submit" />
	</form:form>
</body>
</html>