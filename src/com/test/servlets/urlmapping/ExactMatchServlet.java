package com.test.servlets.urlmapping;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class ExactMatchServlet
 */
//@WebServlet("/ExactMatchServlet")
public class ExactMatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String className ="ExactMatchServlet";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExactMatchServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Constructor In "+className);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        System.out.println("doGet() In "+className);
        request.getSession().getCreationTime();
        
        response.getWriter();
  //      response.getOutputStream();
        request.getAuthType();
        Collection<Part> parts = request.getParts();
        response.getOutputStream();
        
//        response.getWriter().
        for(Part partElems : parts) {
        	partElems.getContentType();
        	partElems.getInputStream();
        }
      //  Cookie[] cookies = request.getCookies();
        Cookie cookieRes = new Cookie("userName","hello");
        cookieRes.setSecure(true);
        cookieRes.setMaxAge(100000);
        cookieRes.setComment("userName Cookie");
        response.addCookie(cookieRes);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        System.out.println("doPost() In "+className);

	}

}
