package project1;

import java.util.Scanner;

public class ArrayIndexFound
{
	public static void main(String[] args)
	{
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		Scanner sc = new Scanner(System.in);
		System.out.print("key :");
		int key = sc.nextInt();
		int index = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				index = i;
				break;
			}
		}
		if(index!=-1)
		{
			System.out.println("Found at " +index);
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}
