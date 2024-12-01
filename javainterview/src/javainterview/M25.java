package javainterview;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Count number of occurrences (or frequency) of each element in a 
 * sorted array  int[] arr = {2, 2, 2, 3, 3, 4, 5, 5, 6, 6};
 * */
public class M25
{
	public static void main(String[] args)
	{
		int[] arr = {2, 2, 2, 3, 3, 4, 5, 5, 6, 6};
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
	}
}
