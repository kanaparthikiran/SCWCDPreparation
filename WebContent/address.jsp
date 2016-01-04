<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--     <%@ include file="billing.jsp" %>
 --%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%-- <jsp:include page="shipping.jsp"/>
 --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ADDRESS</title>
</head>
<body>
<%-- <jsp:params>
<jsp:param value="helloValue1" name="hello1"/>
<jsp:param value="helloValue2" name="hello2"/>
<jsp:param value="helloValue3" name="hello3"/>

</jsp:params> --%>
THIS IS ADDRESS JSP

<jsp:useBean id="product" class="com.test.beans.ProductBean" scope="application">
	<jsp:setProperty name="product" property="price" value="49.95"/>
</jsp:useBean>
Now Printing the Latest Value from the Bean <%= product.getName() %> costs <%= product.getPrice() %>
<%-- <c:url var="nxtUrl" value="cart.jsp">
<jsp:params>

 <jsp:param value="helloValue1" name="hello1"/>
<jsp:param value="helloValue2" name="hello2"/>
<jsp:param value="helloValue3" name="hello3"/>

</jsp:params>

</c:url> --%>
</body>
</html>