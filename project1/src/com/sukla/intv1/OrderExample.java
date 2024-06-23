package com.sukla.intv1;

import java.util.Arrays;
import java.util.List;

public class OrderExample
{
	public static void main(String[] args)
	{
		Product p1= new Product("p1",100.0);
		Product p2= new Product("p2",200.0);
		Product p3= new Product("p3",500.0);
		Product p4= new Product("p4",400.0);
		List<Product> products = Arrays.asList(p1,p2,p3,p4);
		Order orders = new Order("o1",products);
		double totalPrice=calculateTotalPrice(orders);
		System.out.println(totalPrice);
		
	}

	private static double calculateTotalPrice(Order orders)
	{
		return orders.getProductList().stream().mapToDouble(Product::getProductPrice).sum();
		
	}

}
