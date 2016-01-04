<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="TestClassicPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>
<%@ taglib prefix="anything" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %> 
<%@ taglib prefix="bodyMyOwnPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>  
<%@ taglib prefix="tagSimpleTagPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>
<%@ taglib prefix="tagSimpleTagWithDynAttributesPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>
<%@ taglib prefix="testSimpleTagSupportWithNoBodyTestPrefix"  uri="http://anysite:1234/TestClassicTagHandlerIterationTag"%> 
<%@ taglib prefix="testSimpleTagSupportWithBodyTestPrefix" uri="http://anysite:1234/TestClassicTagHandlerIterationTag" %>
<%@ taglib prefix="headerPrefix"  tagdir="/WEB-INF/tags/" %>
<%@ taglib prefix="tldinWebContentWithJspsPrefix" uri="/WEB-INF/tld/testclassHandler.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/header.jsp" %>
<html>

<body>
<br/>NEW TESTING FROM HERE 11111
<TestClassicPrefix:TestClassic fname='<%= request.getParameter("fname") %>' lname='<%= request.getParameter("lname") %>'>
	<h1>NEW TEXT</h1>
	<%
		out.println("Printing the Request Parameters within a Scriptlet " + 
		request.getParameter("fname")+" and LName is "+ request.getParameter("lname"));
	%>
<TestClassicPrefix:TestClassic>This is Inner Test Classic Test SOME TEXT</TestClassicPrefix:TestClassic>

</TestClassicPrefix:TestClassic>


<%-- 	<br/>NEW TESTING TO HERE 11111
	
	
	<br/>NEW TESTING FROM HERE  222222
		
<TestClassicPrefix:TestClassic fname="inlineFname" lname="inlineLastname">
	<h1>NEW TEXT</h1>
	Printing the Attributes Inside the Body of the Classic Handler ${inlineFname}  
	${inlineLname} ${anyInvalidNamethatwillnotBeprinted}
	<br/>The Value of the Request Attribute is ${inC1}<br/><br/><br/>
</TestClassicPrefix:TestClassic>
	<br/>NEW TESTING TO HERE  2222222<br/>
	
	
<tagSimpleTagPrefix:tagSimpleTag userName="helloName" password="helloPassword">
		<br/>THIS IS SIMPLE TAG BODY IN JSP<br/>
</tagSimpleTagPrefix:tagSimpleTag> --%>
	<%-- <c:redirect url="http://www.google.com"></c:redirect> --%>
	

	
	
</body>
</html>