/**
 * 
 */
package com.test.taghandlers.simple;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author kkanaparthi
 *
 */
public class SimpleTagWithDynAttributesHandlerTest extends SimpleTagSupport implements DynamicAttributes {

	
	private String className = "\n" + this.getClass().getName()+" .";
//	Tag parent;
	int count =0;
	String[] testArray = new String[]{"one","two","three"};

	String fname,lname;
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	String finalString;
	
	private void sleeper() {
		try {
			Thread.sleep(1);
			
		} catch(Exception ex) {
				ex.printStackTrace();
			}
	}
	/**
	 * 
	 */
	public SimpleTagWithDynAttributesHandlerTest() {
		
		sleeper();
		System.out.println("This is the Constructor for "+className);
		sleeper();
	}

	@Override
	public void setDynamicAttribute(String paramString1, String paramString2,
			Object paramObject) throws JspException {
		sleeper();
		// TODO Auto-generated method stub
		System.out.println("Now Called the setDynamicAttribute with paramString1 "
				+paramString1+" paramString2 "+paramString2+" paramObject "+paramObject);
		finalString = "Now Called the setDynamicAttribute with paramString1 "
				+paramString1+" paramString2 "+paramString2+" paramObject "+paramObject;
		
		sleeper();
	}
	
	@Override
	public void doTag() throws JspException,IOException {
		sleeper();
		System.out.println("This is doTag() for "+className);
		sleeper();
		getJspContext().getOut().print(finalString);
	}

}
