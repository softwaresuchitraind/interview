package javainterview;

import java.util.Arrays;

// Removing duplicates from an array
public class M52
{
	public static void main(String[] args)
	{
		int x[] = {10,20,20,30,30,30,40,50};
		System.out.println(Arrays.toString(x));
		int size = x.length;
		for(int i=0;i<x.length;i++)
		{
			for(int j =i+1;j<size;j++)
			{
				if(x[i]==x[j])
				{
					for(int k=j;k<size-1;k++)
					{
						x[k]=x[k+1];
					}
					j--;
					size--;
				}
			}
		}
		int y[]= new int[size];
		for(int i=0;i<size;i++)
		{
			y[i]=x[i];
		}
		System.out.println(Arrays.toString(y));
	}
}
