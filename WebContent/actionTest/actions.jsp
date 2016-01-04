<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is Actions JSP</title>
</head>
<body>

This is Actions JSP
<%-- <jsp:attribute name="hello"></jsp:attribute>
 --%><%-- <jsp:params>

</jsp:params> --%>

<%
	out.println("The Attribute H");
%>


<jsp:include page="actionIncluded.jsp">
	<jsp:param value="someValueFromACTIONS-000" name="userName"/>
	<jsp:param value="someValueFromACTIONS-111" name="userName"/>
	<jsp:param value="someValueFromACTIONS-222" name="userName"/>
</jsp:include>



<%-- <jsp:forward page="actionTarget.jsp">
	<jsp:param value="remoteUserValue333333" name="userName"/>
	<jsp:param value="remoteUserValue222222" name="userName"/>
	<jsp:param value="remoteUserValue" name="userName"/>
</jsp:forward>  --%>




</body>
</html>