package com.sukla.sun;

import java.util.Arrays;
import java.util.List;

public class M2
{
	public static void main(String[] args)
	{
		List<Integer> asList = Arrays.asList(10,20,30,40);
		boolean allMatch = asList.stream().allMatch(x->x%2==0);
		System.out.println(allMatch);
		
		boolean anyMatch = asList.stream().anyMatch(x->x%2==0);
		System.out.println(anyMatch);
		
		boolean noneMatch = asList.stream().noneMatch(x->x%2==0);
		System.out.println(noneMatch);
	}
	

}
