package com.test.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class TestParamFilter
 */
@WebFilter(filterName="filter1",urlPatterns="/TestParamFilter")
public class TestParamFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TestParamFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		System.out.println("TestParamFilter.doFilter() START ");
		
		System.out.println("TestParamFilter.doFilter() BEFORE CALLING NEXT FILTER ");

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("TestParamFilter.doFilter() END ");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
