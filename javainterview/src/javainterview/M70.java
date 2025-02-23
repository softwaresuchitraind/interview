package javainterview;
//max element from an odd index Array
public class M70
{
	public static void main(String[] args)
	{
		int arr[] = {5,10,30,4,8,45,65,34};
		
		int max = arr[1];
		
		for(int i=3;i<arr.length;i+=2)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}
}
