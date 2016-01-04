<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page import="com.test.beans.AirlineUser" %>
 --%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is airline JSP</title>
</head>
<body>
This is airline JSP
<jsp:useBean id="airline" class="com.test.beans.AirlineUser" scope="session">
	<jsp:setProperty name="airline" property="firstName" value='<%=request.getParameter("firstName")%>'/>
	<jsp:setProperty name="airline" property="lastName" value= '<%=request.getParameter("lastName")%>'/>
</jsp:useBean>
<%
	out.println("Now Printing the Values of the Bean After the "
				+" Setters have been possibly applied"+ airline);
%>
</body>
</html>