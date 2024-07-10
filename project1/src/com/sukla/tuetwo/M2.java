package com.sukla.tuetwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* common element in two arrays
 * int[] array1 = {1, 2, 3, 4, 5};
	int[] array2 = {4, 5, 6, 7, 8};
 * */
public class M2
{
	public static void main(String[] args)
	{
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {4, 5, 6, 7, 8};
		
		List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
		
		List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(collect);
		
		Set<Integer> collect2 = Stream.concat(Arrays.stream(array1).boxed(), Arrays.stream(array2).boxed()).collect(Collectors.toSet());
		System.out.println(collect2);
	}
}
