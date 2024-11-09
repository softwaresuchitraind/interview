import java.util.Arrays;
/*
 * Input: digits = [1,2,3]Output: [1,2,4]
 * */
public class EmpArray
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,9};
		
		plusOne(arr);
		
		
	}
	public static int[] plusOne(int[] arr) 
	{ 
		arr[arr.length-1]=arr[arr.length-1]+1;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ,");
		}
		return arr;
	}
}

