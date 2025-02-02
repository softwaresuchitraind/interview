package javainterview;

//2nd minimum element using single loop
public class M64
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,5,8,35};
		int min1=arr[0], min2 =arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]<min1)
			{
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]<min2)
			{
				min2=arr[i];
			}
			else if((min1==min2) && (arr[i]>min2))
			{
				min2=arr[i];
			}
		}
		
		System.out.println(min2);
	}
}
