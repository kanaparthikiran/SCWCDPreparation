package com.test.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.beans.ProductBean;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		session.setAttribute("product", new ProductBean("Matrix Bean",39.95));
		
		
		System.out.println("Server Name "+ request.getServerName()+" Server Path "+request.getServletPath()+" Request URL "+request.getRequestURL()
				+ " Local Address "+request.getLocalAddr()+" RequestURI "+request.getRequestURI()+" Local Address "+request.getLocalAddr()
				+" Auth type "+request.getAuthType()+" Local Name "+request.getLocalName()
				+" Remote Address "+request.getRemoteAddr()+ " Query String "+request.getQueryString());
		//response.addCookie(arg0);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/address.jsp");
		//rd = request.getRequestDispatcher("./address.jsp");
		rd.forward(request, response);
//		throw new ArithmeticException();
//		response.getOutputStream();
//		response.getWriter();
//		
//		request.getInputStream();
//		request.getReader();
//		PrintWriter out = response.getWriter();
//		out.println("Thanks for Your Request, Go to Error Page");
//		response.sendError(302);

//		HttpSession session = request.getSession();
//		session.setAttribute("addressOne", new AddressBean("sanjose","CA","123 Main Street"));
//		session.setAttribute("addressTwo", new AddressBean("dallas","TX","123 Chevron Street"));
//		session.setAttribute("addressThree", new AddressBean("iselin","NJ","123 Edison Street"));
//		
//		session.setMaxInactiveInterval(60);
//		// TODO Auto-generated method stub
//		request.getSession();
		
	//	HttpSession session = null;
//		ServletContext context = getServletContext();
//		RequestDispatcher rd = context.getRequestDispatcher("/hello/test.jsp");
//		rd.forward(request, response);
		
	//	response.sendError(404);
//		context.getNamedDispatcher("");
//		context.getRequestDispatcher("")
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
