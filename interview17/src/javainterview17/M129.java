package javainterview17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Write a Java program using java 8 Streams to partition a list of integers into even and odd numbers
 * 
 * Input: [1,3,2,4,6,5]
 * Output: Even Numbers::[2,4,6]
 * 		   Odd Numbers:: [1,3,5]
 * 
 * */

public class M129
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,3,2,4,6,5);
		Map<Boolean, List<Integer>> paritioned = list.stream().collect(Collectors.partitioningBy(n -> n %2 == 0));
		System.out.println("Even Number : "+paritioned.get(true));
		System.out.println("Odd Number : "+paritioned.get(false));
	}
}
