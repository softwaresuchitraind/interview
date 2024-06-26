package com.sukla.int123;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.function.Function;

/*Given an array {10,1, 20, 0, 9, 63, 0, 88, 0}. 
Write a program to move zeros to left side 
Expected output {0,0,0,10,1,20,9,63,88}*/
public class M3
{
	public static void main(String[] args)
	{
		int arr[] = {10,1, 20, 0, 9, 63, 0, 88, 0};
		//OptionalInt first = Arrays.stream(arr).sorted(Collections.reverseOrder()).skip(1).findFirst();
		//System.out.println(first.getAsInt());
		
		int max =arr[0];
		int max1 =arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>max && max1!=max)
			{
				max1 = arr[j];
			}
		}
		System.out.println(max1);
	}

}
