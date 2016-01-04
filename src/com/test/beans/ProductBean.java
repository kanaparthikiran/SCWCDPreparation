/**
 * 
 */
package com.test.beans;

import java.io.Serializable;

/**
 * @author kkanaparthi
 *
 */
public class ProductBean implements Serializable {

	/**
	 * @param name
	 * @param price
	 */
	public ProductBean(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println(" Constructor is Invoked "
				+ "with Values name "+name+" price "+price);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7604717401789335799L;

	
	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("getName() is Called ProductBean()");
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println("SetName() is Called ProductBean() with value "+name);

		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		System.out.println("getPrice() is Called ProductBean()");
		return price;
	}
	/**
	 * 
	 */
	public ProductBean() {
		this("Default", 0.0);
		System.out.println("Default Constructor is Invoked");

		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		System.out.println("setPrice() is Called ProductBean() with value "+name);
		this.price = price;
	}
	private String name;
	private double price;
	
}
