package com.test.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class TestRequestFilter
 */
@WebFilter(
		urlPatterns = { "/TestRequestFilter" }, 
		initParams = { 
				@WebInitParam(name = "initFilterParamName", value = "initFilterParamValue", description = "initFilterParam Description")
		})
public class TestRequestFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TestRequestFilter() {
        // TODO Auto-generated constructor stub
    	
		System.out.println("The Filter TestRequestFilter() CONSTRUCTOR is Called");

    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("The Filter destroy() method is Called");

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("The Filter doFilter() method is Called");

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("The Filter Init method is Called");
	}

}
