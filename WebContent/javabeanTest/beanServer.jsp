<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.beans.AddressBean, java.io.*" %>
<%-- <%@ page session="false" %>   --%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is Bean Server JSP</title>
</head>
<body>
	This is Bean Server JSP
<jsp:useBean id="addressbean"  type="com.test.beans.AddressBean" beanName="sanjose" scope="application">
	<jsp:setProperty name="addressbean" property="city"/>
	<jsp:setProperty name="addressbean" property="state"/>
</jsp:useBean>	

	<%
		String name = request.getParameter("name");	
		String serFilePath = name+".ser";
		out.println("The Servlet Context Path using Servlet Context API "+serFilePath);
		
		String serFilePathReq = request.getServletContext().getContextPath();
		out.println("The Servlet Context Path using serFilePathReq implicit API "+serFilePath);
		
		 FileOutputStream fos = new FileOutputStream(serFilePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(addressbean);
		oos.flush();
		oos.close();
		
		out.println("Done Writing the Serialized Bean to the Output Stream at the path "+serFilePath); 
		
	%>
	
	
</body>
</html>