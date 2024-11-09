package javainterview;

import java.util.Arrays;

/*
 * Input: digits = [1,2,3]Output: [1,2,4]
 * */
public class M3
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3};
		System.out.println("Initial array"+Arrays.toString(arr));
		lastDigitPlusOne(arr);
	}
	public static void lastDigitPlusOne(int[] arr)
	{
		arr[arr.length-1] = arr[arr.length-1]+1;
		System.out.println("Final Array ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}
