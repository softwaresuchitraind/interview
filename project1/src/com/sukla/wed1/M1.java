package com.sukla.wed1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * arr1 = 1,5,3,2,1
 
	arr2 = 2,4,1,5,2
 
	result = 1,2,5
 * */
public class M1
{
	public static void main(String[] args)
	{
		int  []arr1 = {1,5,3,2,1};
		int []arr2=  {2,4,1,5,2};
		
		
		List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		
		Set<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toSet());
		System.out.println(collect);
	}

}
