<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is Action Target</title>
</head>

<body>
<br/>
This is Actions Target JSP<br/><br/>
<%-- <jsp:params>
	<jsp:param value="LocalUser" name="userName"/>
</jsp:params> --%>

<%!
	String s = "123";
%>

<%-- <%=
	pageContext.setAttribute("userName","localUser")
%> --%>

<%
 out.println("The Parameter userName Value is "
					+ request.getParameter("userName"));
%>

</body>
</html>