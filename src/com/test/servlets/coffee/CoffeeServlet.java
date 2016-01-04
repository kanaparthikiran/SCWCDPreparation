package com.test.servlets.coffee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.beans.coffee.CoffeeSelectionBean;

/**
 * Servlet implementation class CoffeeServlet
 */
public class CoffeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoffeeServlet() {
        super();
		System.out.println("The Coffee Servlet Constructor -> CoffeeServlet() ");
    }
    
    @Override
    public void doTrace(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("The Coffee Servlet doTrace() ");

    }

    @Override
    public void init(ServletConfig config) {
		System.out.println("The Coffee Servlet init()  ");
		ServletContext context = config.getServletContext();
		System.out.println("Got the Servlet Context Inside- >  The Coffee Servlet init()  ");
		Enumeration<?> initParamNames = context.getInitParameterNames();
		for(;initParamNames.hasMoreElements();) {
			String initParamInsideInit = (String) initParamNames.nextElement();
			System.out.println("Got the Servlet Context Inside- >  The Coffee "
					+ " Servlet init() initParamInsideInit  "+initParamInsideInit);
		}
		
		Enumeration<?> configInitParams = config.getInitParameterNames();
		for(;configInitParams.hasMoreElements();) {
			String initParamInsideInit = (String) configInitParams.nextElement();
			System.out.println("Got the Servlet Config Inside- >  The Coffee "
					+ " Servlet init() initParamInsideInit  CONFIG "+initParamInsideInit);
		}
    }
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		System.out.println("The Coffee Servlet doGet() ");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.println("The Coffee Servlet doGet() ");

	      System.out.println("Request API Context path "+ 
	      request.getContextPath()+" Path Info "+ request.getPathInfo()
	      +" Servlet Path "+request.getPathInfo()+" Server Name "+request.getServerName());

	      
	     
	      
		if("order".equalsIgnoreCase(request.getParameter("order"))) {
				CoffeeSelectionBean coffeeSelectionBean = new CoffeeSelectionBean();
				request.setAttribute("coffeeList", coffeeSelectionBean.getCoffeeList());
				
				RequestDispatcher rd = request.getRequestDispatcher("coffee/coffeeSelection.jsp");
				rd.forward(request, response);
		} else {
			System.out.println("We are in the Else Condition, so"
					+ " Redirecting the User to coffeeError.JSP is request.getParameter(order) "+request.getParameter("order"));
			RequestDispatcher rd = request.getRequestDispatcher("coffee/coffeeError.jsp");
			rd.forward(request, response);
			
		}
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		System.out.println("The Coffee Servlet doPost() ");
	}
	
	@Override
	public void destroy() {
		System.out.println("The Coffee Servlet destroy() ");
	}

	
}
