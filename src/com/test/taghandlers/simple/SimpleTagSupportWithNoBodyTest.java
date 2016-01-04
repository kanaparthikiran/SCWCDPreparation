/**
 * 
 */
package com.test.taghandlers.simple;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author kkanaparthi
 *
 */
public class SimpleTagSupportWithNoBodyTest extends SimpleTagSupport {
	
	/**
	 * 
	 */
	public SimpleTagSupportWithNoBodyTest() {
		System.out.println("This is the CONSTRUCTOR for "+className);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doTag() throws JspException, IOException {
		
		//findAncestorWithClass(arg0, arg1);
		System.out.println("This is the doTag for "+className);

	//	getJspBody().invoke(null);
		getJspContext().getOut().print("This is the Simplest  Writing from a Simple TagHandler into JSP directly with no body"+className);
	}

	


	private String className = "SimpleTagSupportWithNoBodyTest "+" .";
//	JspTag parent;
//	int count =0;
//	String[] testArray = new String[]{"one","two","three"};
////	PageContext pageContext;
////	BodyContent bodyContent;
//	String fname,lname;
//	
//	
//	/**
//	 * @return the fname
//	 */
//	public String getFname() {
//		
//		System.out.println("getFname()");
//		return fname;
//	}
//
//	/**
//	 * @param fname the fname to set
//	 */
//	public void setFname(String fname) {
//		System.out.println("setFname() to "+fname);
//
//		this.fname = fname;
//	}
//
//	/**
//	 * @return the lname
//	 */
//	public String getLname() {
//		
//		System.out.println("getLname()");
//
//		return lname;
//	}
//
//	/**
//	 * @param lname the lname to set
//	 */
//	public void setLname(String lname) {
//		System.out.println("setLname() to "+lname);
//
//		this.lname = lname;
//	}
//
//

	@Override
	public void setParent(JspTag paramJspTag) {
		// TODO Auto-generated method stub
		super.setParent(paramJspTag);
		System.out.println("Calling the setParent() "+className);

	}

	@Override
	public JspTag getParent() {
		// TODO Auto-generated method stub
		
		System.out.println("Calling the getParent() "+className);
		return super.getParent();
	}

	@Override
	public void setJspContext(JspContext paramJspContext) {
		// TODO Auto-generated method stub
		System.out.println("Calling the setJspContext() "+className);
		super.setJspContext(paramJspContext);
	}

	@Override
	public void setJspBody(JspFragment paramJspFragment) {
		// TODO Auto-generated method stub
		System.out.println("Calling the setJspBody() "+className);
		super.setJspBody(paramJspFragment);
	}


}
