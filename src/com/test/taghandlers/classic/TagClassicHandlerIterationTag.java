/**
 * 
 */
package com.test.taghandlers.classic;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

import org.apache.catalina.ant.FindLeaksTask;

/**
 * @author kkanaparthi
 *
 */
public class TagClassicHandlerIterationTag  implements IterationTag {
	private String className =this.getClass().getClass().getName()+" .";
	
	PageContext pageContext;
	Tag parent;
	int count =0;
	String[] testArray = new String[]{"one","two","three"};
	String fname,lname;

	
//	/**
//	 * @return the pageContext
//	 */
//	public PageContext getPageContext() {
//		return pageContext;
//	}

	/**
	 * 
	 */
	public TagClassicHandlerIterationTag() {
//		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("\n\n\n "+ className+"The Constructor of "+this.getClass().getName());
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
		System.out.println(className+"Setting FirstName ");

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
		System.out.println(className+"Setting LastName ");

		this.lname = lname;
	}


	@Override
	public void setPageContext(PageContext paramPageContext) {
		// TODO Auto-generated method stub
		this.pageContext = paramPageContext;
		System.out.println(className+"Setting PageContext ");
		
		
	}

	
	@Override
	public void setParent(Tag paramTag) {
		// TODO Auto-generated method stub
		this.parent =paramTag;
		System.out.println(className+"Setting Parent ");

		
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		
		System.out.println(className+"getParent()  ");

		return parent;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("doStartTag  ");

		sleeperMethod();
		
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		
		System.out.println(className+"doEndTag");

		sleeperMethod();
		
		return SKIP_PAGE;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		System.out.println(className+"release()  ");

		
	}

	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		JspWriter writer = pageContext.getOut();
		System.out.println(className+"doAfterBody() count "+count);
		sleeperMethod();
		if(count<testArray.length) {
			System.out.println("Checking the Count "+ count+"  with ArrayLength "+testArray.length);
			for(String testArrayElem : testArray) {
				try {
					writer.print(testArrayElem);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Now the Count Is "+count
						+ " Checking the next Array Elements, will evaluate the Body Again");
				sleeperMethod();
				count++;
				return EVAL_BODY_AGAIN;
			}
		}
		System.out.println("Now the Count has Reached/Exceeded "
				+ "  of the Total Array Elements");
		return SKIP_BODY;
	}

	/**
	 * 
	 */
	private void sleeperMethod() {
		try {
			Thread.sleep(1);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
