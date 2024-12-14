package javainterview;

import java.util.Arrays;

//Left Rotate by one
public class M41
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		System.out.println("Initial Array"+ Arrays.toString(arr));
		int x = arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = x;
		System.out.println("Final Array after left rotate :: "+Arrays.toString(arr));
	}
}
