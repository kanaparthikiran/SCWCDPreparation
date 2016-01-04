<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<jsp:useBean id="airlineUser" class="com.test.beans.AirlineUser" scope="application"/>
    
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<title>This is Registration JSP</title>
</head>
<body>
<jsp:setProperty name="airlineUser" property="firstName"  value= '<%= request.getParameter("firstName") %>'/>
<jsp:setProperty name="airlineUser" property="lastName"  value= '<%= request.getParameter("lastName") %>'/>

NOW PRINING THE VALUES AFTER SETTING FROM REQUEST

<%
	out.println("Printing the Bean Value as is "+airlineUser);

	out.println("NOW  using the Plain JSP Way to Extract the Request Parameters  firstName "+ request.getParameter("firstName")
			+" and LastName is "+request.getParameter("lastName"));
%>
<%-- <jsp:getProperty property="firstName" name="airlineUser"/>
 --%>
</body>

</html>