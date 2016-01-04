/**
 * 
 */
package com.test.beans;

import java.io.Serializable;

/**
 * @author kkanaparthi
 *
 */
public class ProductItemBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5804715926300759020L;
	/**
	 * @param productId
	 * @param productName
	 * @param productDescription
	 */
	public ProductItemBean(String productId, String productName,
			String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
	}
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}
	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	String productId;
	String productName;
	String productDescription;
	
	

}
