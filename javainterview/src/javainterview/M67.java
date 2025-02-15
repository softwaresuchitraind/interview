package javainterview;

//Find Sum of all odd index element
public class M67
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8};
		int sum =0;
		
		for(int i=1;i<arr.length;i+=2)
		{
			sum+=arr[i];
		}
		
		System.out.println("Sum of Odd indexed Element "+sum);
	}
}
