package com.sukla.intv1;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HelloWorld
{
	
	public static void main(String args[])
	{
		String s1="ssuchitraau";
		Map<Character, Long> collect = s1.chars()
				.mapToObj(x->(char)x)
		        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
	}
}