<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="headerPrefix"  tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is Tags Test</title>
</head>
<body>
<h1>This is Tags Test</h1>
<%-- <headerPrefix:header someAttrName="UserOne"></headerPrefix:header>
 --%>
 <headerPrefix:header someAttrName="#660099">
	<br/><h1>THIS IS THE BODY FROM THE CALLEE JSP</h1> 
</headerPrefix:header>

</body>
</html>