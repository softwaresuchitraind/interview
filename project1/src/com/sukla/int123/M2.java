package com.sukla.int123;

import java.util.Arrays;

/*Given an array {10,1, 20, 0, 9, 63, 0, 88, 0}. 
Write a program to move zeros to left side 
Expected output {0,0,0,10,1,20,9,63,88}*/
public class M2
{
	public static void main(String[] args)
	{
		int arr[] = {10,1, 20, 0, 9, 63, 0, 88, 0};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(arr[j]!=0)
					{
						int temp= arr[i];
						arr[j]=arr[i];
						arr[i]= temp;
					}
					else
					{
						continue;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
