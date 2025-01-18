package javainterview;

import java.util.Arrays;

//Right rotate by 1
public class M55
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		System.out.print(Arrays.toString(arr));
		int x = arr[arr.length-1];
		for(int i=arr.length-1;i>=1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
		System.out.println();
		System.out.print(Arrays.toString(arr));
		
	}
}
