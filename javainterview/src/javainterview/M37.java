package javainterview;
/*
 * 
 * Removing duplicates from an Array using java 8
 * */

import java.util.Arrays;

public class M37
{
	public static void main(String[] args)
	{
		int arr[] = {10,15,8,49,25,98,98,32,15};
		
		Arrays.stream(arr).forEach(x->System.out.print(x+ " "));
		
		System.out.println("Array elements after distict");
		
		Arrays.stream(arr).distinct().forEach(x->System.out.print(x+ " "));
	}
}
