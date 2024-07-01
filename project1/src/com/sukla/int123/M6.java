package com.sukla.int123;

import java.util.Arrays;

/*
 * String	str = "sukla12 abc sukla23 cdm"
found the count of sukla using java 8
 * */

public class M6
{
	public static void main(String[] args)
	{
		String	str = "sukla12 abc sukla23 cdm";
		
		long count = Arrays.stream(str.split(" ")).filter(x->x.contains("sukla")).count();
		System.out.println(count);
	}
}
