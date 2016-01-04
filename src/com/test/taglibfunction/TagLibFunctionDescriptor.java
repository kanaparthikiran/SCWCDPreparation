/**
 * 
 */
package com.test.taglibfunction;

/**
 * @author kkanaparthi
 *
 */
public class TagLibFunctionDescriptor {
	
	public static String getUpperCase(String inStr) {
		return inStr.toUpperCase();
	}

	public static String getLowerCase(String inStr) {
		return inStr.toLowerCase();
	}
	
	public static int getStringLength(String inStr) {
		return inStr.length();
	}
}
