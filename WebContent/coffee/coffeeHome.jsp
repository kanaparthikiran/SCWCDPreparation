<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Coffee Home JSP</title>
</head>
<body>
Coffee Home JSP

<form id="coffeeid" name="coffeeForm" action="CoffeeServlet" method="POST">
	<input type="text" name="order" id="order"/>
	<input type="submit" name="submit" value="showCoffeeSelections"/>
 </form>

</body>
</html>