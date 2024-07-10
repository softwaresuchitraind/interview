package com.sukla.sat;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Count number of occurrences (or frequency) of each element in a 
 * sorted array  int[] arr = {2, 2, 2, 3, 3, 4, 5, 5, 6, 6};
 * */
public class M21
{
	public static void main(String[] args)
	{
		int[] arr = {2, 2, 2, 3, 3, 4, 5, 5, 6, 6};
		Map<Integer, Long> collect = Arrays.stream(arr).map(x->x).boxed()
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println(collect);
		
		
	}
}
