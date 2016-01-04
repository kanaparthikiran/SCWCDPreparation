<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ page import="java.util.Map,java.util.HashMap" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	
		<a href='<c:url value="http://www.mail.google.com"/>'> Click Here to See How the Encoding Happens</a>

	<c:set var="myChoice" value="SomeValueForTesting"/>
	<c:set var="myChoice" value="null"></c:set>	
	<c:remove var="myChoice"></c:remove>
	<br/><br/>The Value from the myChoice is "${myChoice}"
	<%
		String[] mySmallArray = new String[]{"one","two","three","four","five"};
		request.setAttribute("mySmallArray", mySmallArray);
		session.setAttribute("mySmallArray", mySmallArray);
		application.setAttribute("mySmallArray", mySmallArray);
		pageContext.setAttribute("mySmallArray", mySmallArray,PageContext.PAGE_SCOPE);
	%>
	
	<c:set var="myArray">
		This is Some String Array With Spaces
	</c:set>
		Testing Some Generic Expressions for Remove 
	<br/><br/>
	<%-- <c:remove var="mySmallArray"/> --%>
	
	PRINTING THE ARRAY ELEMENTS <c:out value="${requestScope.mySmallArray[1]}">This is Default Value</c:out>
	
	<c:catch var="myException">
		<% int x =1/0; %>
	</c:catch>
	Now Printing the Messages from the Exception is &nbsp;&nbsp;&nbsp; "${myException.message}"
	
	
	<c:forEach var="loopVar"  items="${mySmallArray}" varStatus="loopVarStatusVariable">
	
		<c:if test="${loopVarStatusVariable.count == '2' }">
			The Loop Count is Two So Printing the Values
			<br/><br/><br/>The Array Elements are <strike><c:out value="${loopVar}"></c:out> &nbsp;&nbsp;&nbsp; And the Status is 
			<c:out value="${loopVarStatusVariable.count}" ></c:out> </strike>
		</c:if>
		<c:choose>
		<c:when test="${loopVarStatusVariable.count%2=='0' }">
			This is an Even Number ${loopVarStatusVariable.count}
		</c:when>
		<c:otherwise>
			PRINTING THE COUNT FOR ODD NUMBERS - <c:out value="${loopVarStatusVariable.count}" ></c:out> 
		</c:otherwise>
		</c:choose>
	</c:forEach>

	Check the Loop Variable OutSide Loop "${loopVar}"
	
	<%
		Map<String,String> simpleMap = new HashMap<String,String>();
		simpleMap.put("oneM", "1");
		simpleMap.put("twoM", "2");
		simpleMap.put("threeM", "3");
		simpleMap.put("fourM", "4");
		simpleMap.put("fiveM", "5");
		
		request.setAttribute("simpeMapKey",simpleMap);
	%>

<c:set target="${simpeMapKey}" property="oneM">
oneMUPDATEDVALUE Inside the Body
</c:set>

The Value of the Changed Value from the Map <c:out value="${simpeMapKey}"></c:out>

NOW TESTING THE REMOTE IMPORT OF THE CONTENT FROM THE URL

<c:import url="http://store.storeimages.cdn-apple.com/4917/as-images.apple.com/is/image/AppleInc/aos/published/images/i/ph/iphone6s/scene3/iphone6s-scene3">
</c:import>
</body>
</html>