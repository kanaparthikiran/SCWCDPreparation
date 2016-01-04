/**
 * 
 */
package com.test.beans;

import java.io.Serializable;

/**
 * @author kkanaparthi
 *
 */
public class AirlineUser implements Serializable {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AirlineUser [firstName=" + firstName + ", lastName=" + lastName
				+ ", employee=" + employee + "]";
	}

	/**
	 * 
	 */
	public AirlineUser() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("The Constructor is Called for AirlineUser()");

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2975307338229585219L;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		System.out.println("getFirstName() is Called for AirlineUser()");
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		System.out.println("setFirstName() is Called for AirlineUser()");
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		System.out.println("getLastName() is Called for AirlineUser()");

		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		System.out.println("setLastName() is Called for AirlineUser()");
		this.lastName = lastName;
	}

	/**
	 * @return the employee
	 */
	public boolean isEmployee() {
		System.out.println("isEmployee() is Called for AirlineUser()");
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(boolean employee) {
		System.out.println("setEmployee() is Called for AirlineUser()");
		this.employee = employee;
	}

	private String firstName;
	private String lastName;
	private boolean employee;
	
}
