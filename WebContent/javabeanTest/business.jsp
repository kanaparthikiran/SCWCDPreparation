<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="com.test.beans.BusinessAddressBean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Business JSP</title>
</head>
<body>
Business JSP Body

<jsp:useBean id="address" class="com.test.beans.BusinessAddressBean" type="com.test.beans.AddressBean" scope="session">
	<jsp:setProperty name="address" property="city" value="San Jose"/>
	<jsp:setProperty name="address" property="state" value="CA"/>
</jsp:useBean>

Now Printing the Values of the Bean 

The Business Beans city Name is "${address.city}"

</body>
</html>