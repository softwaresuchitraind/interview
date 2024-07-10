package com.sukla.mon;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * You are given a string for example. abbcfffccc
 *  print characters having highest count to lowest count.
"abbcfffccc"
 
c - 4
f - 3
b - 2
a - 1
 * */
public class M1
{
	public static void main(String[] args)
	{
		String s = "abbcfffccc";
		s.chars()
		.mapToObj(c->(char)c).
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.sorted((a,b)->b.getValue().compareTo(a.getValue()))
		.forEach(System.out::println);
		
		
	}

}
