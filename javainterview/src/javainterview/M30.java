package javainterview;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
arr1 = 1,5,3,2,1
arr2 = 2,4,1,5,2


union of two Arrays
*/
public class M30
{
	public static void main(String[] args)
	{
		int arr1[] = {1,5,3,2,1};
		int arr2[] = {2,4,1,5,2};
		
		Set<Integer> set = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).collect(Collectors.toSet());
		System.out.println(set);
	}
}
