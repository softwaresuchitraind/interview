package javainterview;
/*
Given an array {10,1, 20, 0, 9, 63, 0, 88, 0}. 
Write a program to move zeros to left side 
Expected output {0,0,0,10,1,20,9,63,88}
 */
public class M11
{
	public static void main(String[] args)
	{
		int [] num = {10,1, 20, 0, 9, 63, 0, 88, 0};
		
		moveZerosToBegin(num);
		
		for(int n : num)
		{
			System.out.print(n+" ");
		}
	}

	private static void moveZerosToBegin(int[] num)
	{
		int lastIndex= num.length-1;
		for(int i=num.length-1;i>=0;i--)
		{
			if(num[i]!=0)
			{
				num[lastIndex]=num[i];
				lastIndex--;
			}
		}
		for(int i=0;i<=lastIndex;i++)
		{
			num[i]=0;
		}
	}
}
