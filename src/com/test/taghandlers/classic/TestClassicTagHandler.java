/**
 * 
 */
package com.test.taghandlers.classic;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

/**
 * @author kkanaparthi
 *
 */
public class TestClassicTagHandler implements Tag {

	/**
	 * 
	 */
	public TestClassicTagHandler() {
		System.out.println("TestClassicTagHandler constructor is Called ");
		// TODO Auto-generated constructor stub
	}

	PageContext pageContext;
	Tag parent;
	JspWriter jspWriter;

	/**
	 * @return the fname
	 */
	public String getFname() {
		System.out.println("get fname() is Called ");
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
		System.out.println("set fname() is Called fname "+fname);
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		System.out.println("get lname is Called  lname "+lname);
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
		System.out.println("set lname is Called lname "+lname);
	}

	String fname,lname;
	
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		String messageToPrint = "doEndTag Message Using ";
		System.out.println(messageToPrint+"  SOP  ");
		JspWriter writer = pageContext.getOut();
		try {
			writer.print(messageToPrint+" \n\n Writer <h1>THIS IS WRITTEN FROM THE END TAG</h1> ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		String messageToPrint = "doStartTag Message Using ";
		System.out.println(messageToPrint+"  SOP  ");
		JspWriter writer = pageContext.getOut();
		pageContext.getAttribute(PageContext.APPLICATION);
//		pageContext.getRequest().setAttribute("inC1", "\tBUDDIBUDDIBUDDAMMA--FROM-REQUEST-CONTEXT\t");
//		pageContext.getSession().setAttribute("inC1", "\tBUDDIBUDDIBUDDAMMA---FROM-SESSION-CONTEXT\t");
		pageContext.getServletContext().setAttribute("inC1", "\tBUDDIBUDDIBUDDAMMA--FROM-SERVLET-CONTEXT\t");
//		pageContext.setAttribute("inC1", "\tBUDDIBUDDIBUDDAMMA-FROM-PAGE-CONTEXT\t",PageContext.PAGE_SCOPE);

		try {
			writer.print(messageToPrint+"  Writer   FName "+getFname()+" LName "+getLname());
			try {
				writer.write("Message to Write Is - >  The Thread is Sleeping, "
						+ "  accepted User Inputs for fName and lName from rtexprvalue ");
				//Thread.sleep(5000);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		System.out.println("  getParent IS "+this.getParent().getClass().getName());
		return this.getParent();
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		System.out.println("  releasing Any Resources Held by the  TagHandler release() ");
		pageContext = null;
		parent = null;
		fname = null;
		lname = null;
	}

	@Override
	public void setPageContext(PageContext arg0) {
		// TODO Auto-generated method stub
		this.pageContext=arg0;
		System.out.println("  setPageContext() called ");
		
	}

	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub
		this.parent=arg0;
		System.out.println("  setParent() called  arg0 class Is "+arg0);

	}

}
