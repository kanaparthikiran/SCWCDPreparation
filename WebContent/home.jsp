<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="TestClassicPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>
<%@ taglib prefix="anything" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %> 
<%@  taglib prefix="bodyMyOwnPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>  
<%@ taglib prefix="tagSimpleTagPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>
<%@ taglib prefix="tagSimpleTagWithDynAttributesPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>
 <%@ taglib prefix="testSimpleTagSupportWithNoBodyTestPrefix"  uri="http://anysite:1234/TestClassicTagHandlerIterationTag"%> 
 
 <%@ taglib prefix="testSimpleTagSupportWithBodyTestPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>
<%@ include file="header.jsp" %>

<%@ taglib prefix="headerPrefix"  tagdir="/WEB-INF/tags/" %>

<%@ taglib prefix="tldinWebContentWithJspsPrefix" uri="/WEB-INF/tld/testclassHandler.tld" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ taglib prefix="jsp" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>
 --%><%-- <%@ page errorPage="./errorPages/500.jsp" %>
 --%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="num" value="20">
</c:set>

NOW DISPLAYING THE C:SET VARIABLE

<c:out value="${num}"/>

<c:forEach var="testValue" begin="0" end="30" step="18">
The Value of testValue at Each Step is ${testValue}
</c:forEach>


<br/><br/>NOW TESTING THE FOR TOKENS METHOD

<c:set var="testArray" value="one,two,three,four,five"/>
<table>
<c:forTokens var="arraysElements" items="${testArray}" delims=",">
<tr><td>${arraysElements}</td></tr>
</c:forTokens>
</table>
<tldinWebContentWithJspsPrefix:TestClassic fname='<%= request.getParameter("fname") %>' lname='<%= request.getParameter("lname") %>'>
	<h1>NEW TEXT FOR tldinWebContentWithJspsPrefix
<%
	out.println("Printing the Request Parameters within a Scriptlet " + 
	request.getParameter("fname")+" and LName is "+ request.getParameter("lname"));
%></h1>
</tldinWebContentWithJspsPrefix:TestClassic>



<br/><br/>
 <headerPrefix:header someAttrName="#660099">
	<br/><h1>THIS IS THE BODY FROM THE CALLEE JSP</h1> 
</headerPrefix:header>

 <br/><br/>THIS IS THE HOME PAGE's BODY 
<!-- THIS IS THE HOME PAGE
THIS IS PART OF THE REST OF THE PAGE-BEFORE TAG -->

<TestClassicPrefix:TestClassic fname='<%= request.getParameter("fname") %>' lname='<%= request.getParameter("lname") %>'>
	<h1>NEW TEXT</h1>
<%
	out.println("Printing the Request Parameters within a Scriptlet " + 
	request.getParameter("fname")+" and LName is "+ request.getParameter("lname"));
%>
</TestClassicPrefix:TestClassic>


<%-- <!-- <form action="./cart.jsp" method="get">
<input type="submit" name="submit" value="gotoCart"/>
</form> -->

<br/><br/><br/><br/>


THIS IS PART OF THE REST OF THE PAGE-AFTER TAG

<%
session.setAttribute("fraction", 5);
/* <c:out value=$5.${fraction}></c:out> */
%>


<%

%>
<anything:testIteration fname="testFname" lname="testLname">
This is Inside the New Tag
<%
	System.out.println("This is System Out Using a Scriptlet inside the Tag Body");
%>
</anything:testIteration>

<br/><br/><br/>
<i><strike>AFTER ITERATION IS ALL DONE</strike></i> --%>


====FROM HERE
<bodyMyOwnPrefix:tagIterationWithBody fname="testFname" lname="testLName">
This is the New Body Tag
</bodyMyOwnPrefix:tagIterationWithBody>

====TO  HERE


<%-- <tagSimpleTagPrefix:tagSimpleTag fname="simpleFname" lname="simpleLname">
<br/><br/><br/>
This is the SimpleTag Body in JSP WHICH IMPLEMENTS THE SIMPLETAG
</tagSimpleTagPrefix:tagSimpleTag>
 --%>


<%-- 
<tagSimpleTagWithDynAttributesPrefix:tagSimpleTagWithDynAttributes fname="HelloNameFrom JSP" age="20 Age From JSP">
	This is the TagLibPrefix with DynamicAttributes

<% 
System.out.println("This is a  Scriptlet inside the SimpleTagLib with DynAttributes");
%>
</tagSimpleTagWithDynAttributesPrefix:tagSimpleTagWithDynAttributes> --%>


<%-- </testSimpleTagSupportWithNoBodyTestPrefix:testSimpleTagSupportWithNoBodyTest>
 --%>

<%--  <testSimpleTagSupportWithBodyTestPrefix:testSimpleTagSupportWithBodyTest>
<h2>THIS IS THE BODY OF THE SIMPLE TAG</h2>
</testSimpleTagSupportWithBodyTestPrefix:testSimpleTagSupportWithBodyTest> --%>

<%--
<% int a = 10; %> 
<%! int a = 20; %> 
<%! int b = 30; %> 
The value of b multiplied by a is <%= b * a %>  --%>


<%-- <testSimpleTagSupportWithNoBodyTestPrefix:testSimpleTagSupportWithNoBodyTest/>
 --%>

</body>


</html>