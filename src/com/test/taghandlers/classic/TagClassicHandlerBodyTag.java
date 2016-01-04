/**
 * 
 */
package com.test.taghandlers.classic;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

/**
 * @author kkanaparthi
 *
 */
public class TagClassicHandlerBodyTag implements BodyTag {
	
	private String className = this.getClass().getClass().getName()+" .";
	Tag parent;
	int count =0;
	String[] testArray = new String[]{"one","two","three"};
	PageContext pageContext;
	BodyContent bodyContent;
	String fname,lname;

	
	/**
	 * 
	 */
	public TagClassicHandlerBodyTag() {
		System.out.println("\n\n\n "+ className  
				+" The Constructor of "+this.getClass().getName());
	}
	
	/**
	 * @return the fname
	 */
	public String getFname() {
		System.out.println(className+"get FirstName ");
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		
		System.out.println(className+"setFname ");

		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		System.out.println(className+"get LastName ");
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		System.out.println(className+"setLname ");

		this.lname = lname;
	}


	
	@Override
	public int doAfterBody() throws JspException {
		
		System.out.println(className+"doAfterBody()");
		JspWriter out = bodyContent.getEnclosingWriter();
		String strStaticText = bodyContent.getString();

		if(count<testArray.length) {
			System.out.println("Comparing the Count "+count
					+" with test Array Length "+testArray.length);
			try {
				String strWrite = strStaticText+testArray[count];
				System.out.println("ITag Count "+count+" Writing "+strWrite);
				out.print(strWrite);
		//		bodyContent.clearBody();
				count++;
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			return EVAL_BODY_AGAIN;
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println(className+"doEndTag");
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println(className+ "doStartTag  ");
		return EVAL_BODY_BUFFERED;
	}

	@Override
	public Tag getParent() {
		System.out.println(className+"getParent()  ");
		return this.parent;
	}


	@Override
	public void release() {
		bodyContent = null;
		pageContext = null;
		parent = null;
		fname=null;
		lname=null;
		System.out.println(className+"release()  ");
	}


	@Override
	public void setPageContext(PageContext arg0) {
		this.pageContext = arg0;
		System.out.println(className+"Setting PageContext ");
	}

	@Override
	public void setParent(Tag arg0) {
		this.parent=arg0;
		System.out.println(className+"Setting Parent ");
	}

	@Override
	public void doInitBody() throws JspException {
		System.out.println(className+" doInitBody() count is "+ (++count));
	}

	@Override
	public void setBodyContent(BodyContent arg0) {
		this.bodyContent=arg0;
		System.out.println(className+"   setBodyContent() and count is "+(++count));
	}

}
