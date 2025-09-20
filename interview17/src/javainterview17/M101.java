package javainterview17;

import java.util.Arrays;

/*
 * 	Modify the elements of the array based on the condition.
 * 
 * */
public class M101
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30,40,50};
		int[] result = Arrays.stream(a).map(num->num<30?num+10:num>30?num+20:num).toArray();
		
		System.out.println(Arrays.toString(result));
	}
}
