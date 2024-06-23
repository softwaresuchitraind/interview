package com.sukla.intv1;

import java.util.List;

public class Order
{
	private String orderId;
	private List<Product> productList;
	public Order(String orderId, List<Product> productList)
	{
		super();
		this.orderId = orderId;
		this.productList = productList;
	}
	public List<Product> getProductList()
	{
		return productList;
	}
	
	

}
