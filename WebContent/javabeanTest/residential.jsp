<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.test.beans.HomeAddressBean,com.test.beans.AddressBean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Residential JSP</title>
</head>
<body>
Residential JSP Body
<% if(1<2)  { %>
<jsp:useBean id="address" class="com.test.beans.HomeAddressBean" type="com.test.beans.AddressBean" scope="request">
	<jsp:setProperty name="address" property="city" value="HomeCityValue"/>
	<jsp:setProperty name="address" property="state" param="state"/>
	<%
		out.println("Came to the Script for Initialization");
		address.setCity("scriptletCityVALUE");
		address.setState("scriptletStateVALUE");
		
		out.println("Address Beans Properties are "+address.getCity()+" The SCRIPTLET END HERE");
	%>
	
	<jsp:getProperty name="address" property="city"/>
</jsp:useBean>
<% } %>

<%
	//	out.println("\n\n SCIPTLET OUTSIDE USEBEAN TAG IS  "+address.getCity());

		AddressBean ab = (AddressBean)pageContext.getRequest().getAttribute("address");
		out.println("the Address Bean from pageContext is " + ab);
		AddressBean ab2 = (AddressBean)request.getAttribute("address");
	%>
	<jsp:useBean id="addressNEW" class="com.test.beans.HomeAddressBean" type="com.test.beans.AddressBean" scope="request">
	</jsp:useBean>
	<jsp:setProperty name="addressNEW" property="state" param="STATENEWVALUE"/>
	<jsp:getProperty name="addressNEW" property="state"/>
	
</body>
</html>