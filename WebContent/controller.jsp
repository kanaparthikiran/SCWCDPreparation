<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is Controller JSP</title>
</head>
<body>
<%
	if(request.getParameter("nextPage").equalsIgnoreCase("cart")) {
%>
	<jsp:forward page="cart.jsp"/>	
<%
	} else if(request.getParameter("nextPage").equalsIgnoreCase("shipping")) {
%>
	<jsp:forward page="shipping.jsp"/>	
<%
	} else if(request.getParameter("nextPage").equalsIgnoreCase("billing")) {
%>
	<jsp:forward page="billing.jsp"/>	

<%
	} else {
	out.println("Since no Target Page exists , sending the user to the HomePage");
%>
	<jsp:forward page="home.jsp"/>	
<%  
	}
%>
</body>

</html>