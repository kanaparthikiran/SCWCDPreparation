package com.test.servlets.urlmapping;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DirectoryMatchServlet
 */
//@WebServlet("/DirectoryMatchServlet")
public class DirectoryMatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String className ="DirectoryMatchServlet";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DirectoryMatchServlet() {
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

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        System.out.println("doPost() In "+className);

	}

}
