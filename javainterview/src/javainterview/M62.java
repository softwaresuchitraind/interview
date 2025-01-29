package javainterview;

//Finding the maximum element in an Array
public class M62
{
	public static void main(String[] args)
	{
		int arr [] = {10,5,20,35,6,54,35,3};
		
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}
}
