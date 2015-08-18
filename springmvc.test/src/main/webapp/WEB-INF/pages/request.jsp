<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Body Result</title>
</head>
<body>
<h3>Request Body Result</h3>
<p>This will not get any result because @RequestBody converts request body to Object generally used for ajax requests </p>
AA::${requestBody}::BB

</body>
</html>