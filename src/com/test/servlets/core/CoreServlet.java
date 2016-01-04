package com.test.servlets.core;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.beans.AddressBean;


/**
 * Servlet implementation class CoreServlet
 */
//@WebServlet("/CoreServlet")
public class CoreServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    int count = 5;
     
    @Override
    public void init() {
	      System.out.println("This is Core Servlet init() and count "+count);

    	getServletConfig().getServletContext();
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoreServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("This is Core Servlet Constructor() ");
    }

    private Cookie createCookies(String name) {
    	Cookie cookie = new Cookie("Chocolate-Cookie",name);
    	cookie.setMaxAge(30);
    	return cookie;
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	      count =  count+1;
	      System.out.println("This is Core Servlet doGet() and count "+count+" "+request.getSession().getId());
	      HttpSession session = request.getSession();
	      
	      
	      session.setAttribute("test", "hello");
	      //session.invalidate();
	      response.addCookie(createCookies("testuser"));
	      
	     // request.logout();
	//      session.setMaxInactiveInterval(0);
	      
	      String testAttributeValue = (String) session.getAttribute("test");
	      
	      System.out.println("The Session Atrribute Value After "
	      		+ " Invalidation "+testAttributeValue);
	      
	     
	      String beforeLogOutId = session.getId();
	      System.out.println("SessionId Before Login "+beforeLogOutId);
	      
	  //    session.setMaxInactiveInterval(10);
	      System.out.println("Checking if the Session is New!");
	      if(session.isNew()) {
	    	  Date date = Calendar.getInstance().getTime();
	    	  date = new Date(session.getCreationTime());
	    	  
	    	  System.out.println("The Session is NEW Creation time is "+ date+" and Id "+session.getId()
	    			  +" Last Accessed Time "+session.getLastAccessedTime());
	      } else {
	    	  Date date = Calendar.getInstance().getTime();
	    	  date = new Date(session.getCreationTime());

	    	  System.out.println("The Session is NOT-NEW Creation time is "+ date+" and Id "+session.getId()
	    			  +" Last Accessed Time "+session.getLastAccessedTime());
	      }
	      request.getServletContext().getInitParameter("name");
	      Set<SessionTrackingMode> sessionTrackModes = request.getServletContext().getDefaultSessionTrackingModes();
	     //getServletContext().setAttribute(paramString, paramObject);
	      
	      for(SessionTrackingMode sMode : sessionTrackModes) {
	    	  System.out.println("The Default Session Tracking "
	    	  		+ "  Modes are Here "+ sMode.name());
	      }
	      request.getServletContext().getInitParameter("");
	      
	      Cookie[] cookies = request.getCookies();
	      if(cookies!=null) {
		      for(Cookie cookieElems : cookies) {
		    	  System.out.println(" The Cookie Name "+ cookieElems.getName()+" Cookie Value "+cookieElems.getValue()
		    			  +" cookieElems Max Age "+cookieElems.getMaxAge()+" Cookie Version "+cookieElems.getVersion()+" cookieElems Secure "
		    			  + cookieElems.getSecure()+" is Http Only "+cookieElems.isHttpOnly()
		    			  +" Cookie Path "+cookieElems.getPath()+" cookieElems Domain "+cookieElems.getDomain()
		    			  +" cookieElems Comment "+cookieElems.getComment()+" ");
		      }
	      }
	      
	      
	      ServletInputStream sis = request.getInputStream();
	      StringWriter sw = new StringWriter();

	      String headerIs = request.getHeader("Accept");
	      
	      int headerIsIntMax = request.getIntHeader("Max-Forwards");

	      
	      while(sis.available()!=0) {
		      sw.write(sis.read());
	      }
	      System.out.println("StringWriter Contents "+sw+"  headerIs "+headerIs+"  headerIsIntMax "+headerIsIntMax
	    		  +" Remote Host "+request.getRemoteHost()
	    		  +" Remote port "+request.getRemotePort()+" Local Port "+request.getLocalPort());
	    
	      //request.logout();

	      String afterLogOutId = session.getId();
	      
	      System.out.println("SessionId After Login "+afterLogOutId);
	      
	      System.out.println("Now Trying to Print The Values from Web XML and API");
	      
	      Enumeration<String> servletInitParamNames = getServletConfig().getInitParameterNames();
	      
	      for(;servletInitParamNames.hasMoreElements();) {
	    	  System.out.println("The Init Param Names are "+ servletInitParamNames.nextElement());
	      }
	      
	      Enumeration<?> contextInitParams = getServletContext().getInitParameterNames();
	      for(;contextInitParams.hasMoreElements();) {
	    	  System.out.println("The Servlet Context Init Param Names are "+ contextInitParams.nextElement());
	      }
	      
//	      response.setContentType("application/jar");
//	      InputStream inStream = getServletContext().getResourceAsStream("/forDownloadjstl.jar");
//	      
//	      byte[] bytes = new byte[1024];
//	      int read = 0;
//	      OutputStream oos = response.getOutputStream();
//	      while((read = inStream.read(bytes)) !=-1) {
//	    	  oos.write(bytes, 0, read);
//	      }
//	      oos.flush();oos.close();
	      
//	      RequestDispatcher rd = getServletContext().getRequestDispatcher("/address.jsp");
//	    		  //request.getRequestDispatcher("address.jsp");
//	      rd.forward(request, response);

//	      response.encodeURL("www.google.com");
	     // response.sendRedirect("http://www.gmail.com");
//	      PrintWriter pw = response.getWriter();
//	      ServletOutputStream sos = response.getOutputStream();
//	      try {
//	      Thread.sleep(5000);
//	      } catch(Exception ex) {
//	    	  ex.printStackTrace();
//	      }
	      AddressBean addressInServlet = (AddressBean) getServletContext().getAttribute("listenerAddress");
	      System.out.println("Adddress Value in the Core Servlet from the  Attribute is "+ addressInServlet);
	      
	  //    response.sendRedirect("CoffeeServlet");
	      
	      AddressBean abDynamic = new AddressBean();
	      abDynamic.setAddress1("123 Main Street");abDynamic.setCity("SanJose");abDynamic.setState("CA");
	      session.setAttribute("forDynamicJsp", abDynamic);
	      
	//      response.setHeader("Content-Length", "10000");

	      getServletContext().setAttribute("contextLevelParam1", "contextLevelParam1-VALUE1-FROM CODE");
	      
	      String ctxParam1 = (String) getServletContext().getAttribute("contextLevelParam1");
	      System.out.println("The ctxParam 1 before removing "+ctxParam1);
	      getServletContext().removeAttribute("contextLevelParam1");
	      System.out.println("The ctxParam 1 After removing "+ctxParam1);
	      

//	      System.out.println("Request API Context path "+ 
//	      request.getContextPath()+" Path Info "+ request.getPathInfo()+" Servlet Path "+request.getPathInfo());
//	      RequestDispatcher rd = request.getRequestDispatcher("/includes/forDynamicIncludes.jsp");
//	      rd.forward(request, response);
	      
	      
	      	response.setContentType("text/html");
	       
	      	PrintWriter out = response.getWriter();
	        out.println("<html>\n  <body>\n");
	        out.println("    <h2>\n      Hello World\n    </h2>\n");
	        out.println("  </body>\n</html>\n");
	        out.flush();
	        out.close();
	        
//	      request.getInputStream();
//	      request.getReader()
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	      System.out.println("This is Core Servlet doPost() ");

	}
	
	public void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
