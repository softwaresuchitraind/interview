package com.suchitra.friday;

public class M1
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};//sorted Array
		
		int i=binarySerch(arr,30);
		if(i!=-1)
		{
		System.out.println("element found at index"+i);
		}
		else
		{
			System.out.println("Element is not fount");
		}
		
	}

	private static int binarySerch(int arr[],int i)
	{
		int midElemnt = arr[arr.length/2];
		if(i<midElemnt)
		{
			for(int j=0;j<arr.length/2;j++)
			{
				if(i==arr[j])
					return j;
			}
		}
		else
		{
			for(int j=arr.length/2;j<arr.length;j++)
			{
				if(i==arr[j])
					return j;
			}
		}
		return -1;
	}

}
