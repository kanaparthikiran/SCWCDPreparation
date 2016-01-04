<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" import="java.util.*" %>

<%@ page session="true" %>

<%@ page buffer="8kb" %>
<%-- <%@ page contentType="text/html; charset=ISO-8859-1" %>
 --%><%@ page isELIgnored="false" %>
<%@ page isErrorPage="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is Core JSP Title</title>
</head>
<body>
	This is Core JSP Body
 	<%
		int counterScriptlet = 4;
%> 

<%= "The Counter Scriptlet INSIDE a DECLARATION " +counterScriptlet %>

	The Response Content Type is = "${pageContext.response.contentType}"

	<%
		counter ++;
		out.println("The Page Accessed "+ counter +" times");
		session.setAttribute("a1", "a1Value");
		
		out.println("The counterScriptlet "+ counterScriptlet +" ");

	%>
	
	<%= "<br/><br/> hello" %>

	<%= new String("isthis") %>
	
		<%= "<br/><br/>"+3+4 %>
			<%= "testing"+13 %>

	<%= "${pageContext.response.contentType}" %>

	<%!
	
		int counter = 10;
		int getValue() {
			return 345;
		}
		
		void getNoValue() {
			return;
		}
		JspWriter js;
		PageContext pc;
	%>


	<%= new String[343].length %>
	<%= 5==2 %>
	<%= new Object().getClass().getName() %>

<%= 
	//config.getInitParameter("jspParamTestName")
	//config.getInitParameterNames()
	//"THIS ONE TO LOOK FOR" + pageContext.getAttribute("contextLevelParam1")
	"THIS ONE TO LOOK FOR" +getServletContext().getInitParameter("contextLevelParam1")
	//pageContext
%>
<%
	pageContext.getException();
	out.println("The Content Length :" 
	+ request.getContentLength());
	application.getAttribute("contextLevelParam1");
	request.getParameter("contextLevelParam1");
	session.getAttribute("contextLevelParam1");
	

	pageContext.setAttribute("one", 4,PageContext.APPLICATION_SCOPE);
	
	out.println("The PageContext Attribute Value is "
	+ pageContext.findAttribute("one"));
	
	
	pageContext.setAttribute("one", 1,PageContext.PAGE_SCOPE);
	pageContext.setAttribute("one", 2,PageContext.REQUEST_SCOPE);
	pageContext.setAttribute("one", 3,PageContext.SESSION_SCOPE);
	
	out.println("The PageContext Attribute GET VALUE  is "
			+ pageContext.getAttribute("one",PageContext.REQUEST_SCOPE));
	
	application.getInitParameter("someParam");


%>

<%!
public void jspInit() {
	ServletConfig servletConfig = getServletConfig();
	String jspInitParam = servletConfig.getInitParameter("jspParamTestName");
	ServletContext context = getServletContext();
	
	context.log("This is doInit() method Called in core.jsp");

	context.setAttribute("jspParamTestName", jspInitParam);

	JspContext js;
	PageContext pc;
}
%>
</body>
</html>