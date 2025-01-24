package javainterview;

//Find the minimum Element in an Array
public class M61
{
	public static void main(String[] args)
	{
		int arr[] = {10, 20, 5, 50, 40};
		
		int min = arr[0];
		
		for (int i=1;i<arr.length;i++)
		{
			if(arr[i] <min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
