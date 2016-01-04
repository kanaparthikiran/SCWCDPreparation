/**
 * 
 */
package com.test.taghandlers.classic;

import java.util.List;

import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author kkanaparthi
 *
 */
public class TagClasssicHandlerIterationWithPageContextAttribute  extends TagSupport{

	
	private List<String> moviesList;
	
	/**
	 * 
	 */
	public TagClasssicHandlerIterationWithPageContextAttribute() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Constructor Called for "
				+ " TagClasssicHandlerIterationWithPageContextAttribute() ");
	}

	private PageContext pageContext;
	private Tag parent;
	
	
	
	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext=pageContext;
		System.out.println("setPageContext Called for "
				+ " TagClasssicHandlerIterationWithPageContextAttribute() ");
	}

	
//	@Override
//	public PageContext getPageContext() {
//		return this.pageContext;
//	}
	
	
	@Override
	public void setParent(Tag parent) {
		this.parent=parent;
		System.out.println("setParent Called for "
				+ " TagClasssicHandlerIterationWithPageContextAttribute() ");
	}
	
	
	@Override
	public Tag getParent() {
		System.out.println("getParent Called for "
				+ " TagClasssicHandlerIterationWithPageContextAttribute() ");
		
		return this.parent;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1603387102121891095L;
	
	@Override
	public int doStartTag() {
		
		System.out.println("doStartTag() Called for "
				+ " TagClasssicHandlerIterationWithPageContextAttribute() ");
		return EVAL_BODY_INCLUDE;
	}
	
	
	@Override
	public int doEndTag() {
		System.out.println("doEndTag() Called for "
				+ " TagClasssicHandlerIterationWithPageContextAttribute() ");
		return EVAL_PAGE;
	}


	@Override
	public int doAfterBody() {
		System.out.println("doAfterBody() Called for "
				+ " TagClasssicHandlerIterationWithPageContextAttribute() ");
		
		if(true) {
			return EVAL_BODY_AGAIN;
		} else {
			return SKIP_BODY;
		}
	}


	/**
	 * @return the moviesList
	 */
	public List<String> getMoviesList() {
		System.out.println("getMoviesList Called for "
				+ " TagClasssicHandlerIterationWithPageContextAttribute() ");
		return moviesList;
	}


	/**
	 * @param moviesList the moviesList to set
	 */
	public void setMoviesList(List<String> moviesList) {
		this.moviesList = moviesList;
		System.out.println("setMoviesList Called for "
				+ " TagClasssicHandlerIterationWithPageContextAttribute() ");
	}
}
