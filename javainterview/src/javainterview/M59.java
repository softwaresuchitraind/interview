package javainterview;

//Find Sum of all the elements in an Array
public class M59
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum = "+sum);
	}
}
