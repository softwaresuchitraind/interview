package javainterview;

import java.util.Arrays;
import java.util.List;

//Sum of numbers in the list
public class M58 
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		Integer sum = list.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}
}

   