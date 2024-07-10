package com.sukla.tueone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class M1
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer("1","abc",15);
		Customer c2 = new Customer("2","mno",25);
		Customer c3 = new Customer("8","xyp",65);
		Customer c4 = new Customer("4","xyz",75);
		Customer c5 = new Customer("5","sts",55);
		
		Map<Integer,Customer> customermap = new HashMap<>();
		customermap.put(1, c1);
		customermap.put(2, c2);
		customermap.put(3, c3);
		customermap.put(4, c4);
		customermap.put(5, c5);
		
		//names starts with x and orders count > 60 
		
		List<Customer> collect = customermap.entrySet().stream()
							  .map(x->x.getValue())
							  .filter(x->x.getName().startsWith("x"))
							  .filter(x->x.getNoOfOrders()>60)
							  .collect(Collectors.toList());
		
		System.out.println(collect);
		
	}

}
