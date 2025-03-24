package javainterview;

//Find minimum value from the 1st half of the Array
public class M75
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,5,40,50,50,60,80,3};
		
		int min = arr[0];
		
		for(int i=0;i<arr.length/2;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("2nd minimum element "+min);
	}
}
