/**
 * 
 */
package com.test.beans;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author kkanaparthi
 *
 */
public class ShoppingCartBean implements Serializable {

	/**
	 * 
	 */
	public ShoppingCartBean() {
	super();
		List<ProductItemBean> prodList = new CopyOnWriteArrayList<ProductItemBean>();
		ProductItemBean p1 = new ProductItemBean("1","Rug","Vintage Rug");
		ProductItemBean p2 = new ProductItemBean("2","Chair","Wooden Chair");
		ProductItemBean p3 = new ProductItemBean("3","Sofa","Leather Rug");
		prodList.add(p1);prodList.add(p2);prodList.add(p3);
		setProductItemsList(productItemsList);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2484559029220494862L;

	private CopyOnWriteArrayList<ProductItemBean> productItemsList;

	/**
	 * @return the productItemsList
	 */
	public CopyOnWriteArrayList<ProductItemBean> getProductItemsList() {
		return productItemsList;
	}

	/**
	 * @param productItemsList the productItemsList to set
	 */
	public void setProductItemsList(CopyOnWriteArrayList<ProductItemBean> productItemsList) {
		this.productItemsList = productItemsList;
	}
	
}
