<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<%@ taglib prefix="tagSimpleTagPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag"%>    
<%@ taglib prefix="testSimpleTagSupportWithBodyTestPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>  
<%@ taglib prefix="tagSimpleTagWithIterationAttributesPrefix"  uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is Simple Tags JSP</title>
</head>
<body>

This is Simple Tags JSP Body
<tagSimpleTagPrefix:tagSimpleTag></tagSimpleTagPrefix:tagSimpleTag>

<testSimpleTagSupportWithBodyTestPrefix:testSimpleTagSupportWithBodyTest>
<br/><br/>This is the Body Which Will be Reflected or Modified by the SimpleTag with BODY and 
Here is An Expression to Evaluate ${3*19} and Another One ${message} 
The Attribute Values Are Here ${planet}

</testSimpleTagSupportWithBodyTestPrefix:testSimpleTagSupportWithBodyTest>

<%
	List<String> moviesList = Arrays.asList(new String[]{"DropZone","Internship","NoteBook"});
	pageContext.setAttribute("moviesList", moviesList);
%>

<%-- <c:set var="moviesList">Dropzone,NoteBook,Internship</c:set> --%>

<tagSimpleTagWithIterationAttributesPrefix:tagSimpleTagWithIterationAttributes moviesList="${moviesList}">
</tagSimpleTagWithIterationAttributesPrefix:tagSimpleTagWithIterationAttributes>


</body>

</html>