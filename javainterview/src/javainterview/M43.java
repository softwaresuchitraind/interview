package javainterview;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

//String arr[]= {"hello","mango","Hi","Hello"};
//Length of each word using java 8 
public class M43
{
	public static void main(String[] args)
	{
		String arr[]= {"hello","mango","Hi","Hello"};
		int[] arr1 = Arrays.stream(arr).mapToInt(String::length).toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[0]+" "+arr1[0]);
		}
	}
}
