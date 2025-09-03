package javainterview;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Given three integer array, write a java 8 program to find and print the elemts that are common to all three arrays
 * 
 * */
public class M88
{
	public static void main(String[] args)
	{
		int a[] = {2,3,4,9};
		int b[] = {2,3,7};
		int []c = {2,3,1};
		
		Set<Integer> setA = IntStream.of(a).boxed().collect(Collectors.toSet());
		Set<Integer> setB = IntStream.of(b).boxed().collect(Collectors.toSet());
		Set<Integer> setC = IntStream.of(c).boxed().collect(Collectors.toSet());
		
		setA.retainAll(setB);
		setA.retainAll(setC);
		
		System.out.println(setA);
	}
}
