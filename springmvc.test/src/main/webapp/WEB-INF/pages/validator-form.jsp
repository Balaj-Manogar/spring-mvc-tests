<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Annotation Based Validation</title>
</head>
<body>
<h2>Subscription Annotation Based Validation</h2>
<form:form modelAttribute="annotationValidation" action="/springmvc.test/book/annotation-validation" method="post">
	Name: <form:input path="name"/><form:errors path="name" cssStyle="color:red;"/><br/>
	Email: <form:input path="email"/><form:errors path="email" cssStyle="color:red;"/><br />
	<input type="submit" value="Subscribe">

</form:form>
</body>
</html>