<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is BeanClient.jsp</title>
</head>
<body>
	This is BeanClient.jsp
	
<form action="./beanServer.jsp" method="post">
	<input type="text" name="city">
	<input type="text" name="state">
	
	<input type="text" name="name">
	
	<input type="submit" name="submit" value="submitValue"/>
</form>

</body>
</html>