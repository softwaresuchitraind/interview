package javainterview;

// 2nd minimum element in an Array
public class M63
{
	public static void main(String[] args)
	{
		int arr[] = {10, 20, 30, 4,8,38,25};
		int min = arr[0];
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min =arr[i];
			}
		}
		
		System.out.println("Min :"+min);
		int ndMin = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<ndMin && arr[i] !=min)
			{
				ndMin = arr[i];
			}
		}
		
		System.out.println("2nd Minimum element in an Array is "+ndMin);
	}
}
