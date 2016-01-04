<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.beans.AddressBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is For DynamicIncludes JSP</title>
</head>
<body>
This is For DynamicIncludes JSP
	<jsp:useBean id="addressBeanForDyn" class="com.test.beans.AddressBean" scope="session">
		<jsp:getProperty name="addressBeanForDyn" property="address1" />
	</jsp:useBean>
</body>
</html>