<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    <%@ page import ="java.util.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Coffee Selection JSP</title>
</head>
<body>
Coffee Selection JSP
<%
	request.setAttribute("coffeeList", 
				Arrays.asList(new String[]{"Mocha","Latte","Cappucino"}));
%>

The Coffee Selection Choices are Here= "${requestScope.coffeeList}"


</body>
</html>