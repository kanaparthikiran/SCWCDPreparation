/**
 * 
 */
package com.test.taghandlers.simple;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;

/**
 * @author kkanaparthi
 *
 */
public class SimpleTagHandlerTest implements SimpleTag, DynamicAttributes {

	private String className = this.getClass().getName()+" .";
	JspTag parent;
	int count =0;
	String[] testArray = new String[]{"one","two","three"};
//	PageContext pageContext;
//	BodyContent bodyContent;
	String fname,lname;
	JspContext jspContext;
	JspFragment jspFragment;
	
	/**
	 * @return the fname
	 */
	public String getFname() {
		
		System.out.println("getFname()");
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		System.out.println("setFname() to "+fname);

		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		
		System.out.println("getLname()");

		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		System.out.println("setLname() to "+lname);

		this.lname = lname;
	}

	/**
	 * 
	 */
	public SimpleTagHandlerTest() {
		
		System.out.println("Calling the Constructor "+className);
		//super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
//		String message = "Calling the doTag() "+className;
//		System.out.println(message);
//		jspContext.getOut().write(message);
//		jspContext.getOut().
		//	PageContext pc = null;
		//	pc.getServletConfig();
		//jspContext.getELContext().get
		String jspContextUserName = (String) jspContext.getAttribute("userName");
		System.out.println("The Attribute is Well Received in the TagHandler "
				+ "  using JSP Context as "+ jspContextUserName);
	}

	@Override
	public void setParent(JspTag paramJspTag) {
		// TODO Auto-generated method stub
		this.parent = paramJspTag;
		System.out.println("Calling the setParent() "+className);

	}

	@Override
	public JspTag getParent() {
		// TODO Auto-generated method stub
		
		System.out.println("Calling the getParent() "+className);
		return this.parent;
	}

	@Override
	public void setJspContext(JspContext paramJspContext) {
		// TODO Auto-generated method stub
		this.jspContext = paramJspContext;
		
		System.out.println("Calling the setJspContext() "+className);

	}

	@Override
	public void setJspBody(JspFragment paramJspFragment) {
		// TODO Auto-generated method stub
		this.jspFragment = paramJspFragment;
		System.out.println("Calling the setJspBody() "+className);
		
	}

	@Override
	public void setDynamicAttribute(String arg0, String arg1, Object arg2)
			throws JspException {
		// TODO Auto-generated method stub
		System.out.println("Accepted the Attribute with the Name as "+ arg1
				+" and Value as "+arg2+"  in "+className);
		
	}

}
