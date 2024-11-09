package com.sukla.projone;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class M2
{
	public static void main(String[] args)
	{
		String[] fruits =
		{ "apple", "banana", "promagnate", "grape" };
		Arrays.stream(fruits)
				.collect(Collectors.toMap(x -> x, String::length))
				.entrySet()
				.stream()
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				.findFirst()
				.ifPresent(System.out::println);

	}

}
