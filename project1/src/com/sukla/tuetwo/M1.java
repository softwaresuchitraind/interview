package com.sukla.tuetwo;

import java.util.Arrays;
import java.util.List;

/*
 * square it and sum it only odd digit
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 * */
public class M1
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer sum = numbers.stream()
				.filter(x->!(x%2==0))
				.map(x->x*x)
				.reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}

}
