/**
 * 
 */
package com.test.beans.coffee;

import java.util.Arrays;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class CoffeeSelectionBean {
	
	private List<String> coffeeList = 
							Arrays.asList(new String[]{"Mocha", "Latte","Venilla","Frappucino", "Cappucino"});

	/**
	 * @return the coffeeList
	 */
	public List<String> getCoffeeList() {
		return coffeeList;
	}
}
