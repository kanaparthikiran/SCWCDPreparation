/**
 * 
 */
package com.test.taghandlers.simple;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;




/**
 * @author kkanaparthi
 *
 */
public class SimpleTagWithIterationAttributesHandlerTest extends
		SimpleTagSupport {
	
	private JspContext jspContext;
	private JspTag parent;
	private  String className = this.getClass().getName();
	private JspFragment jspFragment;
	
	private List<String> moviesList;
	
	public SimpleTagWithIterationAttributesHandlerTest() {
		System.out.println("Called Constructor In  "+className);
	}
	
	@Override
	public void doTag() throws IOException, JspException {
		System.out.println("Started doTag() In  "+className);
		
//		@SuppressWarnings({"unchecked" })
////		List<String> moviesList = (List<String>) jspContext.getAttribute("moviesList");
		for(String moviesListElem : moviesList) {
			jspContext.getOut().write("\n The Movie Name is : "+ moviesListElem);
			jspFragment.invoke(null);
		}
		System.out.println("Exiting doTag() In  "+className);
	}

	
	@Override
	public void setJspContext(JspContext jspContext) {
		System.out.println("Called setJspContext() In  "+className);
		this.jspContext= jspContext;
	}
	
	@Override
	public JspContext getJspContext() {
		System.out.println("Called getJspContext() In  "+className);
		return this.jspContext;
	}
	
	@Override
	public void setParent(JspTag parent) {
		System.out.println("Called setParent() In  "+className);
		this.parent= parent;
	}
	
	@Override
	public JspTag getParent() {
		System.out.println("Called getParent() In  "+className);
		return this.parent;
	}

	/**
	 * @return the jspFragment
	 */
	@Override
	public JspFragment getJspBody() {
		System.out.println("Called getJspBody() In  "+className);
		return jspFragment;
	}

	/**
	 * @param jspFragment the jspFragment to set
	 */
	public void setJspBody(JspFragment jspFragment) {
		System.out.println("Called setJspBody() In  "+className);
		this.jspFragment = jspFragment;
	}

	/**
	 * @return the moviesList
	 */
	public List<String> getMoviesList() {
		
		System.out.println("Called getMoviesList() In  "+className);

		return moviesList;
	}

	/**
	 * @param moviesList the moviesList to set
	 */
	public void setMoviesList(List<String> moviesList) {
		System.out.println("Called setMoviesList() In  "+className);

		this.moviesList = moviesList;
	}
	
}
