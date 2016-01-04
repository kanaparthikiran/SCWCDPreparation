<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is Hello JSP</title>
</head>
<body>
<h1>Welcome to the Hello JSP</h1>
<%-- <%
	out.flush();
%> --%>
<%-- <%
	if(request.getParameter("userName")!=null) {
%> 
<jsp:forward page="handleIt.jsp">
	<jsp:param name="userName" value="testuser"/>
</jsp:forward>
<%
	} else {
		out.println("The Hello JSP is Not Forarded to Any Page");
	}
%>
 --%>
 
 <c:import url="https://www.google.com/?gws_rd=ssl#">
 <c:param name="q" value="apple"></c:param>
 </c:import>
<c:url var="cUrlVar" value="handleIt.jsp">
	<c:param name="userName" value="testUserForCurl"></c:param>
	<c:param name="password" value="testPassword For Curl"></c:param>
</c:url>

<a href="<c:url value='${cUrlVar}'/>">  CLICK HERE</a>
 
</body>
</html>