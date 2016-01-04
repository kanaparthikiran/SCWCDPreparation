package com.test.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.beans.ShoppingCartBean;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        
        System.out.println(" Started ControllerServlet.constructor()");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("ControllerServlet doGet()");
		HttpSession session = request.getSession(true);
		
		if(session.getAttribute("cart")==null) {
			System.out.println("The Cart is Not Present in a Session");
			ShoppingCartBean sb = new ShoppingCartBean();
			session.setAttribute("cart", sb);
//			sb.setProductItemsList(new ProductItemBean());
		} else {
			System.out.println("The Cart is ALREADY Present in a Session");
		}
		
		if(request.getParameter("nextPage").equalsIgnoreCase("billing")) {
			getServletConfig().getServletContext().getRequestDispatcher("/billing.jsp").forward(request, response);
		} else if(request.getParameter("nextPage").equalsIgnoreCase("shipping")) {
			getServletConfig().getServletContext().getRequestDispatcher("/shipping.jsp").forward(request, response);
		} else if(request.getParameter("nextPage").equalsIgnoreCase("cart")) {
			getServletConfig().getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
		} else {
			getServletConfig().getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        System.out.println(" Started ControllerServlet.constructor()");

	}

}
