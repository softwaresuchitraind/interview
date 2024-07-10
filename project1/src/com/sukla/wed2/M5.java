package com.sukla.wed2;

import java.util.stream.IntStream;

//Print 1st 20 even number using stream API
public class M5
{
	public static void main(String[] args)
	{
		IntStream.iterate(2,n->n+2).limit(20).forEach(System.out::println);
	}

}
