package com.sukla.tueone;

public class Customer
{
	String id;
	String name;
	int noOfOrders;
	
	public Customer()
	{
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String name, int noOfOrders)
	{
		super();
		this.id = id;
		this.name = name;
		this.noOfOrders = noOfOrders;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getNoOfOrders()
	{
		return noOfOrders;
	}

	public void setNoOfOrders(int noOfOrders)
	{
		this.noOfOrders = noOfOrders;
	}

	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", name=" + name + ", noOfOrders=" + noOfOrders + "]";
	}
	

}
