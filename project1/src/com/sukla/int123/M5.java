package com.sukla.int123;

import java.util.Arrays;
import java.util.List;

public class M5
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		List intList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		intList.parallelStream().forEach(i->{
		System.out.println(i);
		int count = 1;
		count++;
		System.out.println("count:"+count);
		});
		
	}

}
