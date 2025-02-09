package javainterview;
// Find sum of all even indexed element in an Array

public class M66
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60};
		
		int sum =0;
		for(int i =0 ;i<arr.length;i+=2)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of odd indexed elemnt is "+sum);
	}
}
