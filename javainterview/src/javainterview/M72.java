package javainterview;
//Find out sum of elements in the 1st half of the Array
public class M72
{
	public static void main(String[] args)
	{
		int arr[] = {10,5,6,2,4,7,10};
		int sum =0;
		for(int i=0;i<=arr.length/2;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println(sum);
	}
}
