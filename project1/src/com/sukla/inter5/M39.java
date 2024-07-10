package com.sukla.inter5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Find only the duplicate elements using java 8 stream
List<Integer> list = Arrays.asList(10,10,20,30,20,15,40,5);
 * */
public class M39
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,10,20,30,20,15,40,5,10);
		
		list.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()>1)
		.map(Map.Entry::getKey)
		.forEach(System.out::println);
	}
}
