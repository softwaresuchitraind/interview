package javainterview;
//Find out sum of elements in the 2nd half of the Array
public class M73
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60,70,80};
		
		int sum =0;
		for(int i= (arr.length/2);i<arr.length;i++)
		{
			sum = sum+ arr[i];
		}
		
		System.out.println(sum);
	}
}
