<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page buffer="8kb" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@page isErrorPage="false" session="false" isThreadSafe="false" %>
 --%>
<%@ taglib prefix="elTestLibPrefix" uri="http://anysite:1234/TestELTags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is ELTest</title>
</head>
<body>

<%! int x =4; %>
 <%
 	request.setAttribute("one", "1Request");
 	request.setAttribute("two", "2Request");
  	session.setAttribute("one", "1Session");
	session.setAttribute("two", "2Session");
 	application.setAttribute("one", "1Application");
	application.setAttribute("two", "2Application");
 	
	pageContext.setAttribute("one", "\n 1000PAGE\n",PageContext.PAGE_SCOPE);
	pageContext.setAttribute("two", "\n 2000PAGE\n",PageContext.PAGE_SCOPE);
 
  	pageContext.setAttribute("one", "1000Session",PageContext.SESSION_SCOPE);
	pageContext.setAttribute("two", "2000Session",PageContext.SESSION_SCOPE);
 
 	String userName = request.getParameter("userName");
 	out.println("The Request Parameter Values in the Scriptlet are "+userName);
 	out.println("The Variabele x value in Scriptlet is  "+x);
 	
 	Map mapOne = new HashMap();
 	mapOne.put("oneMapKey1","OneMapValue1");
 	mapOne.put("oneMapKey2","OneMapValue2");
 	mapOne.put("oneMapKey3","OneMapValue3");
 	mapOne.put("oneMapKey4","42");
 	mapOne.put("oneMapKey5","true");
 	mapOne.put("oneMapKey6","false");
 	mapOne.put("7","hello7");

 	request.setAttribute("oneMap", mapOne);
 	
 	request.setAttribute("oneArray",new int[]{1,2,3,4,9,10});
 	request.setAttribute("index","2");
 %>

	The One Map Values are ="${oneMap[7]}"

	The One oneArray Values are ="${oneArray["3"]}"

	The One Map Values are ="${oneMap['oneMapKey3']}"
	
	The One Array Values are ="${oneArray['3']}"
	
	The Num Values from the Core Servlets are ${paramValues.num[2]}
	
		The page Buffer Size = "${pageContext.out.bufferSize}"
	
	The page Buffer Size = "${pageContext.out.bufferSize}"
	This is ELTest ContextPath = "${pageContext.request.contextPath}"
	This is Protocol = "${pageContext.request.protocol}"
	This is Method = "${pageContext.request.method}"
	This is Request SessionId = "${pageContext.request.requestedSessionId}"
	This is sessionScope Use = "${sessionScope}"
	The Session Creation Time ${pageContext.session.creationTime}
	The Session Inactive Interval ${pageContext.session.maxInactiveInterval}
	The Server Info is  ${pageContext.session.servletContext.serverInfo}
	The Class Loader Info  is  ${pageContext.session.servletContext.classLoader}
	
	The Values In the Page Scope are "${pageScope.one}"
	The Request Parameter Values In the EL are userName= "${paramValues.userName[0]}"
	
	The Request API from Here
	The Request URI is ${pageContext.request.requestURI}
	The Request UserPrincipal Name is ${pageContext.request.userPrincipal.name}
	The Request Auth Type Name is ${pageContext.request.authType}
	The Request Char Encoding is ${pageContext.request.characterEncoding}
	The Request Local Address is ${pageContext.request.localAddr}
	The Request Local Address is ${pageContext.request.contentType}
	
		The Request Local Address is WITH CHANGES ${request.requestURI}
	
	
	The Response API from Here
	
	The Response Content Type is =  "${pageContext.response.contentType}"
	The Response Content Char Encoding is =  "${pageContext.response.characterEncoding}"
	The Response Content Buffer Size is =  "${pageContext.response.bufferSize}"
	
	
	The Header API from Here
	The Header Host is "${header.host}"
	The Header Server is "${header.server}"
	The Header Cookie is "${header.cookie}"
	The Header User-Agent is "${header.user-agent}"
	
	The Header Values Host is using Header Values is "${headerValues.host[0]}"
	The Header Values Host is using Header Values 2nd Syntax "${headerValues.host["0"]}"
	The Header Values Host is using Header Values 3rd Syntax "${headerValues.host['0']}"
		
	EL Arithmetic Operators from HERE
	3 + 4 value is ="${3+4}""
	2* 3.14159 value is ="${2* 3.14159}"
	
	Another One value is ="${x}"
	
	
	EL Arithmetic Operators to HERE
	
	NOW EL Relational Operators START
	This Expression Evaluates to "${3==3.1 || 21 lt 22}"

	This Expression Evaluates to TERNARY "${(3==3.0)?1:2}"
	
	NOW EL Relational Operators END
	<%-- The Session Attribute Names : ${pageContext.session.attributeNames["2"]}
	--%>

	The UnClaimed Variable Value is "${one}"

	The Variable X value in Expression Language is = ${x}
	The Script Expression X value is x = <%= x %>
	
	NOW TESTING THE EL FUNCTIONS
	
	The EL Value for the Given Input will be = "${elTestLibPrefix:length("hello world check")}"
	The EL Value for the Given Input will be = "${elTestLibPrefix:upper("hello world")}"
	The EL Value for the Given Input will be = "${elTestLibPrefix:lower("HELLOWORLD TEST")}"
	
	
		This Expression Evaluates to TERNARY LATEST "${(3==a)?1:2}"
		
		This Expression Evaluates to TERNARY LATEST 2222 "${a}"
		
		The application Scope Values are= "${applicationScope.helloVar}"
		
		The Cookie Is ${cookie.JSESSIONID}
		
				The Cookie Is ${cookie["JSESSIONID"]["value"]}
		
		
		<%
			int nums[] = {42,420,4200};
			request.setAttribute("foo", nums);
			
		%>
	${5+3 lt 6}
	${requestScope['foo'][0] ne 10 div 0}
	${10==0}
	
	${"2"+"1"}
	
	<%
		java.util.Map map = new HashMap();
		request.setAttribute("map", map);
		map.put("a", "b");
		map.put("b", "c");
		map.put("c", "d");
	%>
	
one value	${map.c}
two value	${map[c]}
three value	${map["c"]}
four value	${map[map.b]}

<%-- 	${map.map.b}
	${map[map.b]}
	${map.(map.b)} --%>
	
<% session.setAttribute("name", "Diogenes"); %>
The Session Scope Name Variable is -   ${paramValues}
	Result is ${"a" < "b"}
	
	Result AS VARS is ${a < b}
	Result AS VARS2 is ${a > b}
	
	Result is ${"aliteral  indeed."}
	
	Result is 2 divided by mod zero ${2 / 0}
	
	Result is null mod1 ${null mod 1}
	
	<% request.setAttribute("list", new String[0]); 
	
	String[] names = new String[]{"Rihanna", "Lopez", "Kylie"};
	   request.setAttribute("names", names);
	   
	   request.setAttribute("email", "request@info");
	   session.setAttribute("email", "session@info");
	   pageContext.setAttribute("email", null);
	   application.setAttribute("email", "application@info");
	
	%>
</body>
</html>