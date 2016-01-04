/**
 * 
 */
package com.test.beans;

import java.io.Serializable;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author kkanaparthi
 *
 */
public class AddressBean implements Serializable,HttpSessionBindingListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8637150660257171037L;
	private final String className = "  AddressBean ";

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddressBean [city=" + city + ", state=" + state + ", address1="
				+ address1 + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressBean other = (AddressBean) obj;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * 
	 */
	public AddressBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param city
	 * @param state
	 * @param address1
	 */
	public AddressBean(String city, String state, String address1) {
		super();
		this.city = city;
		this.state = state;
		this.address1 = address1;
	}
	private String city;
	private String state;
	private String address1;

	@Override
	public void valueBound(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
		// TODO Auto-generated method stub
		paramHttpSessionBindingEvent.getSession().getAttribute("");
		System.out.println("The Address Bean value is BOUND To Session" + paramHttpSessionBindingEvent.getValue()+" In class "+className);
		
	}
	@Override
	public void valueUnbound(
			HttpSessionBindingEvent paramHttpSessionBindingEvent) {
		// TODO Auto-generated method stub
		System.out.println("The Address Bean value is UN-BOUND To Session" + paramHttpSessionBindingEvent.getValue()+" In class "+className);

	}
	
}


